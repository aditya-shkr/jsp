<%-- 
    Document   : footer
    Created on : Mar 9, 2017, 11:06:48 PM
    Author     : MY
--%>


     <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script> 
    
    <!--<script src="js/additional-methods.min.js" type="text/javascript"></script>-->
    
    
    
    <script src="js/bootstrap-datepicker.min.js" type="text/javascript"></script>
    <script src="js/jquery.validate.min.js" type="text/javascript"></script>
    <script src="js/jquery.dataTables.min.js" type="text/javascript"></script>
    <script src="js/table_dynamic.js" type="text/javascript"></script>
   <script src="js/select2.min.js" type="text/javascript"></script>
   
   <script>
        
        function showmessage(type,msg)
        {
            var str='';
            if(type=="success")
            {
                str="<div class='alert alert-succeess alert-dismissable'><a href='#' onclick=\"$("#showmessage").css('display','none');\" class='close' data dismiss='alert' aria-label= 'close'></a><strong>well Done!</strong>&nbsp;"+msg+"</div>";
             
        }
        else if(type=="error")
        {
        str="<div class='alert alert-danger alert-dismissable'><a href= '#' onclick=\"$("#showmessage").css('display','none');\" class='close' data dismiss='alert' aria-label= 'close'>x</a><strong>Error occured!</strong>&nbsp;&nbsp;"+msg+"</div>";
             
        
        }
        else if(type=="warning")
        {   
        
        str="<div class='alert alert-warning'>
       <strong>warnning!</strong>&nbsp;&nbsp;"+msg+"</div>";
             
        
        
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
