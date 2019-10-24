




/* 添加选中多行商品到 list数组中： 作为参数添加到 inBill页面 */
	
	function inBill1() {
		var item = $('#data-datagrid').datagrid('getSelections');
		if(item == null || item.length == 0){
			$.messager.alert('信息提示','请选择要删除的数据！','info');
			return;
		}

		for ( var i = 0; i < item.length; i++) {
			$('#sellBill_goods').datagrid('insertRow', {
				index : i + 1, // 索引从0开始
				row : {
						   code: i,
					goods_id : item[i].goods_id,
					goods_name : item[i].goods_name,
					goods_unit :item[i].goods_unit ,
					goods_number :1,
					goods_number2 :item[i].goods_number,
					goods_price : item[i].goods_price,
					company_id:  item[i].company_id,
					price:item[i].goods_number*item[i].goods_price
			
				}
			});
		}
		
		calculate1()
	}

	//计算每一行的单价
	function calculate1() {
		var count=0;
		var item = $('#sellBill_goods').datagrid('getRows');
		for(var i = 0; i < item.length; i++){
			$("#sellBill_goods").datagrid("endEdit",i);
			count1=item[i].goods_price*item[i].goods_number;
			$('#sellBill_goods').datagrid('updateRow',{
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
	
		
		$("#sbill_turnover").html(count);
	}
	
	function removeThisRow1(){
    
    var item = $('#sellBill_goods').datagrid('getSelected');
    $('#sellBill_goods').datagrid('deleteRow',item.code-1);
        calculate1();

    }	

	//提交申请单
	function addsaleBill(){
		calculate1() ;
		
		//$("#sellBill_goods").datagrid("endEdit",rowIndex);
		
		var item = $('#sellBill_goods').datagrid('getRows');
		if(item == null || item.length == 0){
			$.messager.alert('信息提示','请添加销售的商品！','info');
			return;}
		var rows =[]; var name=""; var person=""; var tel="";
		var Bill={}
		if($("#scompany_name").val()==""){$.messager.alert('信息提示','请填写采购方公司！','info');   return;}
		if($("#scompany_linkman").val()==""){$.messager.alert('信息提示','请填写采购人！','info');    return;}
		if($("#scompany_tel").val()==""){$.messager.alert('信息提示','请填写采购人电话号码！','info'); return;}
		
		
		Bill.company_name=$("#scompany_name").val();
		Bill.company_person=$("#scompany_linkman").val();  
		Bill.company_tel=$("#scompany_tel").val();
		Bill.bill_turnover=$("#sbill_turnover").html();
		Bill.bill_dept=$("#sbill_dept").val();
		Bill.bill_handler=$("#sbill_handler").val();
		Bill.bill_note=$("#sbill_note").val();
		
		for(var i = 0; i < item.length; i++){
			var option={}
			option.price=item[i].goods_price;
			option.num=item[i].goods_number;
			option.company=item[i].company_id;
			option.goods=item[i].goods_id;
		  rows.push(option);
		}
		Bill.rows=rows;
//	 console.log(rows);
//	 console.log(Bill);

		$.ajax({
			url:'../../admin/bill/addSellBill',
			dataType:'json',
			type:'post',
			data:Bill,
			success:function(data){
				
				if(data.type == 'success'){
					$.messager.alert('信息提示',data.msg,'info');
					$('#sellBill').dialog({closed : true});
				}else{
					$.messager.alert('信息提示',data.msg,'warning');
				}
				
			}
		});
		 $('#sellBill_goods').datagrid('loadData', {total:0,rows:[]});
		 $('#sellBill').dialog({closed : true});
		
	}

	
	
	
	function openSellBill() {
		var item = $('#data-datagrid').datagrid('getChecked');
		if (item == null || item.length == 0) {
			$.messager.alert('信息提示', '请选择要销售的商品！', 'info');
			return;
		}

		$('#sellBill').dialog({
			closed : false,
			modal : true,
			title : "申请核销售申请表",
			onClose : function() {
				$('#sellBill_goods').datagrid('loadData', {total:0,rows:[]});
            },
			buttons : [ {
				text : '提交审核',
				iconCls : 'icon-ok',
				handler : addsaleBill
			},{
				text : '取消',
				iconCls : 'icon-cancel',
				handler : function() {
					$('#sellBill_goods').datagrid('loadData', {total:0,rows:[]});
					$('#sellBill').dialog('close');
				}
			},{
				text : '刪除行',
				iconCls : 'icon-cancel',
				handler : removeThisRow1
			},{
				text : '打印',
				iconCls : 'icon-printer',
				handler : removeThisRow1
			}],onBeforeOpen : function() {
				inBill1();
			}
		});
	}