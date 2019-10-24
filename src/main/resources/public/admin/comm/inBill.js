
/* 添加选中多行商品到 list数组中： 作为参数添加到 inBill页面 */
	
    //var list = new Array();
   /*生成list数组  */
//	function inBill() {
//	var item = $('#data-datagrid').datagrid('getChecked');
//
//		list = [];//清空数组
//		for ( var i = 0; i < item.length; i++) {
//			list.push({
//				goods_id : item[i].goods_id,
//				goods_name : item[i].goods_name,
//				goods_unit : item[i].goods_unit,
//				goods_price : item[i].goods_price,
//				goods_number : Math.abs(item[i].goods_number),
//			    company_id : item[i].company_id,
//			});
//			//console.log("成功添加" + (i + 1));
//		}
//		append()
//	}

    function inBill() {
    	var item = $('#data-datagrid').datagrid('getSelections');
		if(item == null || item.length == 0){
			$.messager.alert('信息提示','请选择要删除的数据！','info');
			return;
		}

		for ( var i = 0; i < item.length; i++) {
			$('#inBill_goods').datagrid('insertRow', {
				index : i + 1, // 索引从0开始
				row : {
						   code: i,
					goods_id : item[i].goods_id,
					goods_name : item[i].goods_name,
					goods_unit :item[i].goods_unit ,
					//goods_number :item[i].goods_number,
					goods_number :1,
					goods_price : item[i].goods_price,
					company_id:  item[i].company_id,
					price:item[i].goods_number*item[i].goods_price
			
				}
			});
		}
		
		calculate()
    	}
    
    
	//计算每一行的单价
	function calculate() {
		var count=0;
		var item = $('#inBill_goods').datagrid('getRows');
		for(var i = 0; i < item.length; i++){
			$("#inBill_goods").datagrid("endEdit",i);
			count1=item[i].goods_price*item[i].goods_number;
			$('#inBill_goods').datagrid('updateRow',{
				index: i,
				row: {
					    code: i + 1,
						goods_id : item[i].goods_id,
						goods_name : item[i].goods_name,
						goods_unit :item[i].goods_unit ,
						goods_number :item[i].goods_number,
						goods_price : item[i].goods_price,
						company_id:item[i].company_id,
						price:item[i].goods_number*item[i].goods_price
				}
			});
			count = count + count1;
		}
	
		
		$("#count").html(count);
	}
//	/*把数据追加到文本框 */
//	function append() {
//      	
//	if (list != null && list.length > 0) {
//			for ( var i = 0; i < list.length; i++) {
//				$('#inBill_goods').datagrid('insertRow', {
//					index : i + 1, // 索引从0开始
//					row : {
//							   code: i + 1,
//						goods_id : list[i].goods_id,
//						goods_name : list[i].goods_name,
//						goods_unit :list[i].goods_unit ,
//						goods_number :list[i].goods_number,
//						goods_price : list[i].goods_price,
//						company_id:  list[i].company_id,
//						price:list[i].goods_number*list[i].goods_price
//					}
//				});
//			}
//		}
//		
//	calculate();
//	}
	
	
	function removeThisRow(){
		var item = $('#inBill_goods').datagrid('getSelected');
	    $('#inBill_goods').datagrid('deleteRow',item.code-1);
	        calculate();
    }	

	

	//提交申请单
	function addBillPru(){
		calculate() ;
		var item = $('#inBill_goods').datagrid('getRows');
		if(item == null || item.length == 0){
			$.messager.alert('信息提示','请添加采购的商品！','info');
			return;}
		var rows =[];
		var Bill={}
		Bill.bill_turnover=$("#count").html();
		Bill.bill_dept=$("#name").val();
		Bill.bill_handler=$("#buyer").val();
		Bill.bill_note=$("#note").val();
		
		for(var i = 0; i < item.length; i++){
			var option={}
			option.price=item[i].goods_price;
			option.num=item[i].goods_number;
			option.company=item[i].company_id;
			option.goods=item[i].goods_id;
		  rows.push(option);
		}
		Bill.rows=rows;
	 //console.log(rows);
	 //console.log(Bill);

		$.ajax({
			url:'../../admin/bill/addinBill',
			dataType:'json',
			type:'post',
			data:Bill,
			success:function(data){
				
				if(data.type == 'success'){
					$.messager.alert('信息提示',data.msg,'info');
					$('#inBill').dialog({closed : true});
				}else{
					$.messager.alert('信息提示',data.msg,'warning');
				}
				
			}
		});
		$('#inBill_goods').datagrid('loadData', {total:0,rows:[]});
		$('#inBill').dialog('close');
		
	}

	
	
	
	function openinBill() {
		var item = $('#data-datagrid').datagrid('getChecked');
		if (item == null || item.length == 0) {
			$.messager.alert('信息提示', '请选择要采购的商品！', 'info');
			return;
		}

		$('#inBill').dialog({
			closed : false,
			modal : true,
			title : "申请核销售申请表",
			onClose : function() {
				list = [];//清空数组
				 $('#inBill_goods').datagrid('loadData', {total:0,rows:[]});
            },
			buttons : [ {
				text : '提交审核',
				iconCls : 'icon-ok',
				handler : addBillPru
			},{
				text : '取消',
				iconCls : 'icon-cancel',
				handler : function() {
					$('#inBill_goods').datagrid('loadData', {total:0,rows:[]});
					$('#inBill').dialog('close');
				}
			},{
				text : '刪除行',
				iconCls : 'icon-cancel',
				handler : removeThisRow
			},{
				text : '打印',
				iconCls : 'icon-printer',
				handler : add
			}],onBeforeOpen : function() {
				inBill();
			}
		});
	}