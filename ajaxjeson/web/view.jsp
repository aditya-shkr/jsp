<%-- 
    Document   : view
    Created on : Mar 23, 2017, 8:45:29 PM
    Author     : MY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<%@include file="db.jsp"%>
<body>
  <input type="hidden"  id="viewallact" name="viewallact" value="viewall"/>
   <input type="hidden"  id="addact"  name="addact" value="add"/>
    <input type="hidden"  id="delact" name="deletact" value="delete"/>
       <input type="hidden"  id="showact" name="showact" value="show"/>
  <input type="hidden"  id="updateact" name="updateact" value="Update"/>
  
  <div id="page-wrapper">
      
      <div class="container-fluid">
          <div class="row">
              
              <button type="button" class="btn btn-info btn-lg"  data-toggle ="modal" data-target="#myModal" >Add Student</button>
              
              <h2>Student info</h2>
              <div class="table responsive">
                  
                 <table id="stuinfotb1" class="table table-bordered table-hover table-striped">
                     <thead><tr>
                             <th> ID</th>
                                  <th> ID</th>  
                                  <th> NAME</th>   
                                  <th> MOBILE</th>
                                  <th> Gender</th>
                                  <th> Action</th>
                           </tr>
                     </thead>     
                     <tbody>
                         <% int count=0;
                         Statement st=con.createStatement();
                         ResultSet rs=st.executeQuery("select * from student");
                         while(rs.next())
                         {
                             rs.getInt("id");
                             %>
                             <tr>
                                 <td><div align="center"><%=++count%></div>    </td>   
                                 <td><%=rs.getString("name")%></td>
                                  <td><%=rs.getString("mobile")%></td>
                                   <td><%=rs.getString("email")%></td>
                                    <td><%=rs.getString("gender")%></td>
                                    <td><div align="center"><a href="javascript:showmodel(<%=rs.getInt("id")%>)">Edit</a><a href="javascript:showdelmodel(<%=rs.getInt("id")%>)">Delete </a></div></td>
                             </tr>
                             <%}%>
                     </tbody>
                 </table>
              </div>
          </div>
                     <!--/.row-->
      </div>
                     <!--container field-->
  </div>
                     
                     
                     
                     <div id="delModal" class="modal fade" role= "dialog">
                      <div class="modal-dialog">   
                         
                       <div class="modal-content">    
                            <div class="modal-header"> 
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 clas="modal-body"></h4>
                                </div>
                           <div class="modal-body">
                               <p> Do you really want to delete??</p>
                              
                               
                               
                
                           </div>
                           <div class="modal-footer">
                               <a href="javascript:deletestu()" id="btnYes"   class="btn danger">Yes</a>
                               <a href="#" data-dismiss="modal" aria-hidden="true" class="btn secondary"> No </a>
                               </div>
                               
                                </div>
                               
                               
                               
                           </div>
                         
                     </div>                  
                     
                     
                     <div id="myModal" class="modal fade" role="dialog">
                         <div class="modal-dialog">
                         <div class="modal-content">
                         <div class="modal-header">
                             
                              <button type="button" class="close" data-dismiss="modal">&times;</button>
                            
                             <h4 class="modal-title"> please Fill up Student info</h4>
                             </div>
                             <div class="modal-body">
                                 <form id="stufrm" name="stufrm" method="post" enctype="multipart/form-data">
                                     <input type="hidden" id="id" name="id"/>
                                     <div class="row">
                                         
                                       <div class="col-lg-8">
                                           <div class="form-group">
                                               <label for="receipent-name" class="control-label"> Name</label>
                                               
                                               <input type="text" class="form-control" id="name" name="name">
                                               
                                           </div>
                                     </div>
                                 
                                 
                             </div>
                                     <div class="row">
                                         <div class="col-lg-8">
                                             <div class="form-group">
                                               <label for="receipent-name" class="control-label">Mobile Number</label>
                                               
                                               <input type="text" class="form-control" minlength="10" maxlength="10" id="mobile" name="mobile">
                                             </div>
                                           </div>
                                         </div>
                                     
                                     
                                     <div class="row">
                                         <div class="col-lg-8">
                                             <div class="form-group">
                                               <label for="receipent-name" class="control-label">Email</label>
                                               
                                               <input type="text" class="form-control"  id="email" name="email">
                                             </div>
                                           </div>
                                         </div>
                                     <div class="row">
                                         <div class="col-lg-8">
                                             <div class="form-group">
                                               <label for="receipent-name" class="control-label">Gender</label>
                                               
                                               <select id="gender" name="gender">
                                                   <option value="">Select Gender</option>  
                                                   <option value="male">Male</option>  
                                                   <option value="female">Female</option>  
                                                   
                                                   
                                                   
                                               </select>
                                             </div>
                                           </div>
                                         </div>
                                      <div class="row">
                                          <div class="col-lg-8">
                                              <div id="showbtn">
                                                  <button type="button" id="addbtn" class="btn btn-primary" onClick="savestu()">SAVE STUDENT</button>
                                                  
                                                  
                                              </div>
                                          </div>
                                          </div>
                             </div>
                         </div>
                     
                             </form>
                                 </div>                          
                         <div class="modal-footer">                            
                         </div>                            
                         </div>                 
                  
              
          
          
          
         





<%@include file="footer.jsp"%>
<script>
//    $(document).ready(function(){
//        viewall();
//        var table=$(#stuinfotb1).datatable({
//            
//            
//            "order":[[,"desc"]],
//            "fnDrawCallback":function(oSettings){
//                $('#b1 thead th').each(function(i)
//                        
//        {
//            if(!$(this).hasClass('tfilter')){
//                $(this).removeClass("sorting");
//                $(this).off();
//            }
//        });
//            }
//        });
//            
//            
//            
//});
function viewall()
{
    $.getJSON("CRUD.jsp",{
        act:$("#viewallact").val()
    
    },displayResult);               
}
    
  function displayResult(data){
         
     var arr1=JSON.stringify(data);
     var arr=JSON.parse(arr1);
     var len=arr.length;
     var str="";
     for(var i=0;i<len;i++)
     {
         if(arr[i].id!=0)
         {
             str=str+"<tr><td><div align='center'>"+arr[i].id+"</div></td><td>"+arr[i].name+"</td><td>"+arr[i].mobile+"</td>
             <td>"+arr[i].email+"</td>
             <td>"+arr[i].gender+"</td>
             <td><div align='center'><a href=\"javascript:showmodel("+arr[i].id+")\">EDIT</a>
             <a href=\"javascript:showmodel("+arr[i].id+")\">DELETE</a></div></td> </tr>";
             
         }
     }    
     $("#stuinfotb1>tbody:last").html("");
     $("#stuinfotb1>tbody:last").append(str);
 }
 function savestu()
 {
     $.get("CRUD.jsp"),{
         name:$("#name").val(),
           mobile:$("#mobile").val(),
             email:$("#email").val(),
               gender:$("#gender").val(),  
               act:$("#addact").val()
           },doInsert);
           
               
     }
     function doInsert(response){
         if(response){
             showmessage("success","Inserted successfully");
             clearstu();
             $("#myModal").modal("hide");
             viewall();
         }
         else{
             showmessage("error","some Error occured");
         
         }
         
  }
  function showdelmodel(i)
  {
      document.getElementByid('id').value=i;
      $('#delModal').modal('show');
      
  }
    function showmodal(i)
    {
        document.getElementByid('id').value=i;
        $("#myModal").modal('show');
        $("#showbtn").html("");
        var str='<button type="button" id="updatebtn" class="btn btn-primary" onClick="updatestu()">UPDATE STUDENT</button>';
    $("#showbtn").html(str);
    $.get("CRUD.jsp",{
        id:$("#id").val(),
        act:$("showact").val()}
    ,doShow);
        
    }
    function doShow(data){
        if(data)
        {
            $("#name").val(data.name);
              $("#email").val(data.email);
                $("#mobile").val(data.mobile);
                  $("#gender").val(data.gender);
        }
    
    }
    function updatestu(){
        $.get("CRUD.jsp",{
            name:$(#name).val();
             mobile:$(#mobile).val();
             email:$(#email).val();
             gender:$(#gender).val();
             id:$("#id").val(),
             act:$("#updateact").val()
             id:$("#id").val(),
             act:$("#update").val();
         
        },doUpdate);
     }
            
            
            
            
        function doUpdate(response)
        {
            if(response){
                showmessage("Success","update successfully");
                clearstu();
                $('#myModal').modal('hide');
                viewall();
                $("#showbtn").html("");
                
                var str='<button type="button" id="addbtn" class="btn btn-primary" onclick="savestu()">SAVEStudent</button>';
                $("#showbtn").html(str);
            }
            else
            {
                showmessage("error","some Error Occured");
                
            
        } 
                
        }
        function doDelete(response)
        {
            if(response)
            {
                showmessage("success","deleted successfully");
                $('#delModal').modal('hide');
                vieall();
            }
            else
            {
                showmessage("error","some Error Occured");
            }
    
        }
    
    function deletestu()
 {
     $.get("CRUD.jsp"),{
         id:$("#id").val(),
         
          act:$("#deleteact") .val()
      },doDelete);  
           
    
    }
    
    
    
    function clearstu()
    {
        $("#id").val("");
        $("#name").val("");
          $("#moble").val("");
            $("#email").val("");
             $("#gender").val("");
 
}
    
    </script>
    </body>