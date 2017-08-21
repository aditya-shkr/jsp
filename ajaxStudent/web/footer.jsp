<%-- 
    Document   : footer
    Created on : 24 Mar, 2017, 3:10:05 PM
    Author     : Aditya
--%>
<script src="js/jquery-3.1.1.min.js" type="text/javascript"></script>
<script src="js/additional-methods.min.js" type="text/javascript"></script>
<script src="js/bootstrap-datepicker.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/jquery-ui.min.js" type="text/javascript"></script>
<script src="js/jquery.dataTables.min.js" type="text/javascript"></script>
<script src="js/jquery.validate.min.js" type="text/javascript"></script>
<script src="js/select2.min.js" type="text/javascript"></script>
<script src="js/table_dynamic.js" type="text/javascript"></script>
<script type="text/javascript">

    $(document).ready(function () {
        $('#stuinfotb1').dataTable();
        $('#maritalStatus').select2();
        $('#gender').select2();
        $('#addForm').validate();
        viewall();
    });

    function viewall()
    {
        $.getJSON("crud.jsp", {
            act: $("#viewallact").val()
        }, displayResult);
    }

    function displayResult(data) {

        var arr1 = JSON.stringify(data);
        var arr = JSON.parse(arr1);
        var len = arr.length;
        var str = "";
        for (var i = 0; i < len; i++)
        {
            if (arr[i].id !== 0)
            {
                str = str + "<tr><td><div align='center'>" + arr[i].id + "</div></td><td>" + arr[i].name + "</td><td>" + arr[i].mobile + "</td><td>" + arr[i].email + "</td><td>" + arr[i].gender + "</td><td><div align='center'><a href=\"javascript:showmodel(" + arr[i].id + ")\">EDIT</a>/<a href=\"javascript:showdelmodel(" + arr[i].id + ")\">DELETE</a></div></td> </tr>";

            }
        }
        $("#stuinfotb1>tbody:last").html("");
        $("#stuinfotb1>tbody:last").append(str);
    }
    function savestu() {
        $.get("crud.jsp", {name: $("#name").val(), email: $("#email").val(), address: $("#address").val(), mobile: $("#mobile").val(), phone: $("#phone").val(), gender: $("#gender").val(), maritalStatus: $("#maritalStatus").val(), dob: $("#dob").val(), class: $("#class").val(), act: $("#addact").val()}, doInsert);
    }
    function doInsert(response) {
        if (response) {
//            showmessage("success", "Inserted successfully");
            clearstu();
            $("#myModal").modal("hide");
            viewall();

        } else {
            showmessage("error", "some Error occured");
        }

    }
    function clearstu()
    {
        $("#id").val("");
        $("#name").val("");
        $("#moble").val("");
        $("#email").val("");
        $("#gender").val("");
    }
    function showmodel(i)
    {
        document.getElementById('id').value = i;
        $("#myModal").modal('show');
        $("#showbtn").html("");
        var str = '<button type="button" id="updatebtn" class="btn btn-primary" onClick="updatestu()">UPDATE STUDENT</button>';
        $("#showbtn").html(str);
        $.get("crud.jsp", {
            id: $("#id").val(),
            act: $("#showact").val()}, doShow);
    }
    function doShow(data) {
        if (data)
        {           
            $("#name").val(data.name);
            $("#email").val(data.email);
            $("#address").val(data.address);
            $("#mobile").val(data.mobile);
            $("#phone").val(data.phone);
            $("#gender").val(data.gender);
            $("#maritalStatus").val(data.maritalStatus);
            $("#dob").val(data.dob);
            $("#class").val(data.class);
            
        }
        

    }
    function updatestu(){
            $.get("crud.jsp", {id: $("#id").val(),name: $("#name").val(), email: $("#email").val(), address: $("#address").val(), mobile: $("#mobile").val(), phone: $("#phone").val(), gender: $("#gender").val(), maritalStatus: $("#maritalStatus").val(), dob: $("#dob").val(), class: $("#class").val(), act: $("#updateact").val()}, doUpdate);
            }
            function doUpdate(response)
            {
            if (response){
//            showmessage("Success", "update successfully");
            clearstu();
            $('#myModal').modal('hide');
            viewall();
            $("#showbtn").html("");
            var str = '<button type="button" id="addbtn" class="btn btn-primary" onclick="savestu()">SAVE Student</button>';
            $("#showbtn").html(str);
            }
            else
            {
            showmessage("error", "some Error Occured");
            }

            }
                    
             function showdelmodel(i)
            {
            document.getElementById('id').value = i;
            $('#delModal').modal('show');
            }
            function deletestu()
            {
            $.get("crud.jsp",{id:$("#id").val(),act:$("#deleteact").val()}, doDelete);}
            function doDelete(response)
            {
            if (response)
            {
//            showmessage("success", "deleted successfully");
            $('#delModal').modal('hide');
            viewall();
            }
            else
            {
            showmessage("error", "some Error Occured");
            }

            }
            function showmessage(type,msg)
        {
            var str='';
            if(type.equals("success"))
            {
                str="<div class='alert alert-succeess alert-dismissable'><a href='#' onclick=\"$("#showmessage").css('display','none');\" class='close' data-dismiss='alert' aria-label= 'close'></a><strong>well Done!</strong>&nbsp;"+msg+"</div>";
             
        }
        else if(type.equals("error"))
        {
        str="<div class='alert alert-danger alert-dismissable'><a href= '#' onclick=\"$("#showmessage").css('display','none');\" class='close' data-dismiss='alert' aria-label= 'close'>x</a><strong>Error occured!</strong>&nbsp;&nbsp;"+msg+"</div>";
             
        
        }
        else if(type.equals("warning"))
        {   
        
        str="<div class='alert alert-warning'>
       <strong>warnning!</strong>&nbsp;&nbsp;"+msg+"</div>";
             
        
        
        }
        $("#showmessage").html("");
        $("#showmessage").css("display","block");
        $("#showmessage").css("height","35px");
        $("#showmessage").append(str);
        setTimeout(function(){
            $("#showmessage").html("");
        $("#showmessage").css("display","none");},5000);
        }
</script>
</body>
</html>
