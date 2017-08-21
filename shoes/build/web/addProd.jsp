<%-- 
    Document   : addProd
    Created on : 14 Apr, 2017, 4:15:04 PM
    Author     : Aditya
--%>

<%@include file="header.jsp" %>
        <title>JSP Page</title>
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    <a href="../../index2.html" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>IND</b>A</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Indian</b>ANDAZ</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>

      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">

          <li class="dropdown user user-menu">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <span class="hidden-xs">Admin</span>
            </a>
            <ul class="dropdown-menu">
              <!-- User image -->

              <!-- Menu Body -->
              <li class="user-body">
                <div class="row">
                  <div class="col-xs-4 text-center">
                    <a href="#">Vendors</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Sales</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Stocks</a>
                  </div>
                </div>
                <!-- /.row -->
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Profile</a>
                </div>
                <div class="pull-right">
                  <a href="#" class="btn btn-default btn-flat">Sign out</a>
                </div>
              </li>
            </ul>
          </li>

        </ul>
      </div>
    </nav>
    
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
     <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="../../dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>Admin</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        <li class="active treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>Dashboard<a href="index.html"></span>

          </a>
          <ul class="treeview-menu">

          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-files-o"></i>
            <span>Orders</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/layout/top-nav.html"><i class="fa fa-circle-o"></i> Add Order</a></li>
            <li><a href="pages/layout/boxed.html"><i class="fa fa-circle-o"></i> Cancel Order</a></li>
            <li><a href="pages/layout/fixed.html"><i class="fa fa-circle-o"></i> Update Order</a></li>
          </ul>
        </li>

        <li class="treeview">
          <a href="#">
            <i class="fa fa-pie-chart"></i>
            <span>Products</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
              <li><a href="addProd.jsp"><i class="fa fa-circle-o"></i> Add Product</a></li>
            <li><a href="pages/charts/update product.html"><i class="fa fa-circle-o"></i> Update Product</a></li>
            <li><a href="pages/charts/flot.html"><i class="fa fa-circle-o"></i> Remove Product</a></li>

          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-laptop"></i>
            <span>Stock</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/UI/general.html"><i class="fa fa-circle-o"></i> Stock Details</a></li>
            <li><a href="pages/UI/icons.html"><i class="fa fa-circle-o"></i> Check Availability</a></li>

          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-edit"></i> <span>Vendors</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/forms/general.html"><i class="fa fa-circle-o"></i> Add Vendors</a></li>
            <li><a href="pages/forms/advanced.html"><i class="fa fa-circle-o"></i> Remove Vendors</a></li>
<!--             <li><a href="pages/forms/editors.html"><i class="fa fa-circle-o"></i> Editors</a></li>
 -->          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-table"></i> <span>Reports</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/tables/simple.html"><i class="fa fa-circle-o"></i> Order Details</a></li>
            <li><a href="pages/tables/data.html"><i class="fa fa-circle-o"></i> Product Details</a></li>
			<li><a href="pages/tables/data.html"><i class="fa fa-circle-o"></i> Vendor Details</a></li>
          </ul>
        </li>

      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <section class="content-header">
      <h1>
        General Form Elements
        <small>Preview</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Product</a></li>
        <li class="active">Add Product</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <!-- left column -->
        <div class="col-md-6">
          <!-- general form elements -->
          <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Add Product</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form role="form" action="insertProd.jsp">
              <div class="box-body">
                <div class="form-group">
                  <label for="exampleInputEmail1">Product Name:</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" name="pname" placeholder="Enter Product Name">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Product Description:</label>
                  <textarea class="form-control" rows="5" name="pdesc" id="comment"></textarea>
                </div>
				        <div class="form-group">
                  <label for="exampleInputPassword1">Product Price:</label>
                  <input type="text" class="form-control" name="price" id="exampleInputPassword1" placeholder="Enter Product Price">
                </div>
                <div class="form-group">
                <label>Date Created at:</label>

                <div class="input-group date">
                  <div class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                  </div>
                    <input type="date" class="form-control pull-right" name="date1" id="datepicker">
                </div>
                <!-- /.input group -->
              </div>
                <div class="form-group">
                  <label for="exampleInputFile">Choose Product Image:</label>
                  <input type="file" id="exampleInputFile">

                  <p class="help-block">* Please choose the .jpg and .png format only</p>
                </div>

              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </form>
          </div>
         
        </div>
        <!--/.col (left) -->
        <!-- right column -->

        <!--/.col (right) -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.3.12
    </div>
    <strong>Copyright &copy; 2014-2016 <a href="http://indian-andaz.com">Indian-ANDAZ</a>.</strong> All rights
    reserved.
  </footer>

  <!-- Control Sidebar -->
   <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->


<%@include file="footer.jsp" %>
