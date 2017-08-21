<%-- 
    Document   : temp
    Created on : 31 Mar, 2017, 5:10:28 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script>
       function viewall()
                    {
                    $.getJSON("crud.jsp", {
                    act:$("#viewallact").val()
                    }, displayResult);
                    }

            function displayResult(data){

            var arr1 = JSON.stringify(data);
            var arr = JSON.parse(arr1);
            var len = arr.length;
            var str = "";
            for (var i = 0; i < len; i++)
            {
            if (arr[i].id != 0)
            {
            str = str + "<tr><td><div align='center'>" + arr[i].id + "</div></td><td>" + arr[i].name + "</td><td>" + arr[i].mobile + "</td>
            <td>"+arr[i].email+"</td>
                <td>"+arr[i].gender+"</td>
                <td><div align='center'><a href=\"javascript:showmodel("+arr[i].id+")\">EDIT</a>/
                <a href=\"javascript:showdelmodel("+arr[i].id+")\">DELETE</a></div></td> </tr>";

            }
            }
            $("#stuinfotb1>tbody:last").html("");
            $("#stuinfotb1>tbody:last").append(str);
            }
            function savestu(){
            $.get("crud.jsp", {name:$("#name").val(), email:$("#email").val(), mobile:$("#mobile").val(), gender:$("#gender").val()}, doInsert);
            }
            function doInsert(response){
            if (response){
            showmessage("success", "Inserted successfully");
            clearstu();
            $("#myModal").modal("hide");
            viewall();
            }
            else{
            showmessage("error", "so,']+3me Error occured");
            }

            }
            function showdelmodel(i)
            {
            document.getElementByid('id').value = i;
            $('#delModal').modal('show');
            }
            function showmodel(i)
            {
            document.getElementByid('id').value = i;
            $("#myModal").modal('show');
            $("#showbtn").html("");
            var str = '<button type="button" id="updatebtn" class="btn btn-primary" onClick="updatestu()">UPDATE STUDENT</button>';
            $("#showbtn").html(str);
            $.get("crud.jsp", {
            id:$("#id").val(),
                    act:$("showact").val()}
            , doShow);
            }
            function doShow(data){
            if (data)
            {
            $("#name").val(data.name);
            $("#email").val(data.email);
            $("#mobile").val(data.mobile);
            $("#gender").val(data.gender);
            }

            }
            function updatestu(){
            $.get("crud.jsp", {
            name:$(#name).val(),
                    mobile:$(#mobile).val(),
                    email:$(#email).val(),
                    gender:$(#gender).val(),
                    id:$("#id").val(),
                    act:$("#updateact").val(),
                    id:$("#id").val(),
                    act:$("#update").val();
            }, doUpdate);
            }
            function doUpdate(response)
            {
            if (response){
            showmessage("Success", "update successfully");
            clearstu();
            $('#myModal').modal('hide');
            viewall();
            $("#showbtn").html("");
            var str = '<button type="button" id="addbtn" class="btn btn-primary" onclick="savestu()">SAVEStudent</button>';
            $("#showbtn").html(str);
            }
            else
            {
            showmessage("error", "some Error Occured");
            }

            }
            function doDelete(response)
            {
            if (response)
            {
            showmessage("success", "deleted successfully");
            $('#delModal').modal('hide');
            vieall();
            }
            else
            {
            showmessage("error", "some Error Occured");
            }

            }
            function deletestu()
            {
            $.get("crud.jsp"), {
            id:$("#id").val(),
                    act:$("#deleteact").val()
            }, doDelete);
            }
            function clearstu()
            {
            $("#id").val("");
            $("#name").val("");
            $("#moble").val("");
            $("#email").val("");
            $("#gender").val("");
            }
            function showmessage(type,msg)
        {
            var str="";
            if(type=="success")
            {
                str=str+"<div class='alert alert-succeess alert-dismissable'><a href='#' onclick=\"$("#showmessage").css('display','none');\" class='close' data dismiss='alert' aria-label= 'close'></a><strong>well Done!</strong>&nbsp;"+msg+"</div>";
             
        }
        else if(type=="error")
        {
        str="<div class='alert alert-danger alert-dismissable'><a href= '#' onclick=\"$("#showmessage").css('display','none');\" class='close' data dismiss='alert' aria-label= 'close'>x</a><strong>Error occured!</strong>&nbsp;&nbsp;"+msg+"</div>";
             
        
        }
        else if(type=="warning")
        {   
        
        str="<div class='alert alert-warning'><strong>warnning!</strong>&nbsp;&nbsp;"+msg+"</div>";
             
        
        
        }
        $("#showmessage").html("");
        $("#showmessage").css("display","block");
        $("#showmessage").css("height","35px");
        $("#showmessage").append(str);
        setTimeout(function(){$("#showmessage").html("");
        $("#showmessage").css("display","none");},5000);
        }
            </script>
    </body>
</html>
