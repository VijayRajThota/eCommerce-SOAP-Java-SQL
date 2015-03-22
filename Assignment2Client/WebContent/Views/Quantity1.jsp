<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="http://getbootstrap.com/favicon.ico">

    <title>SignIn</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <!--  script src="css/ie-emulation-modes-warning.js"></script>-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="container">
  <div class="row">
    <div class="span12">
      <form class="form-horizontal span6" method = "post" action = "Quantity1">
        <fieldset>
          <legend>Order</legend>
       
         
       
          
          <div class="control-group">
            <label class="control-label">Product</label>
            <input name ="brand" id="brand" class="input-block-level" placeholder="Product" >
            <div class="controls">
              <div class="row-fluid">
                <div class="span9">
                                  </div>
                
              </div>
            </div>
          </div>
       
          <div class="control-group">
            <label class="control-label" for = "count" id = "count">Quantity</label>
            <input name="count" id="count" class="form-control" placeholder="Quantity" >
            <div class="controls">
              <div class="row-fluid">
                <div class="span3">
                 
                </div>
                <div class="span8">
                  <!-- screenshot may be here -->
                </div>
              </div>
            </div>
          </div>
       
          <div class="form-actions">
            <button type="submit" class="btn btn-primary"  >Submit</button>
            <button type="button" class="btn">Cancel</button>
          </div>
        </fieldset>
      </form>
    </div>
  </div>
</div>
    <script src="css/ie10-viewport-bug-workaround.js"></script>
  

</body></html>