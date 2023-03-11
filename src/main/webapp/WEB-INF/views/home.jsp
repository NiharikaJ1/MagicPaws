<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
  <meta charset="utf-8">
  <title>Magic Paws</title>
  <audio  class="n-music"controls>

    <source src="audio/music.mp3" type="audio/mpeg">

  </audio>

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <link rel="stylesheet" href="resources/style.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@900&family=Ubuntu:wght@700&display=swap" rel="stylesheet">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  <script src="https://kit.fontawesome.com/b96d968a85.js" crossorigin="anonymous"></script>

</head>

<body>
  <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> -->

  <!-- Nav Bar -->
  <section id="title">




<div class="nav">



      <nav class="navbar navbar-expand-md  navbar-dark">
        <a   href=""><img class="navimg" src="resources/images/paw.png" alt=""> </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#nik" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="nik">
          <ul class="navbar-nav ms-auto">
            <li class="nav-item ">
              <a class="nav-link" href="#contact"> Contact </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#Service"> Service </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#testimonials"> About </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="admin"> Admin </a>
            </li>
            
            <li >
              <a class = "nav-link" href=""> Team </a>
            </li>
          </ul>
          </div>
        </div>

      </nav>



      <!-- Title -->

      <div class="row">


        <div class="col-lg-12 nikki">
          <h1>Introducing Magic Paws</h1>
          <h2 class="h">Your Pet's Health Is In Good Hands</h2>

<a href="choice"><button class="btn btn-dark btn-lg download" >BOOK NOW</button> </a> 
        </div>

      </div>
  </section>



  <!-- Features -->


  <section id="features">

      <div class="row">

        <div class="feature-box col-md-4">

          <i class="icon fa-solid fa-circle-check fa-4x"></i>
          <h3>Experienced Team</h3>
          <p>Talented doctors with friendly nature</p>
        </div>
        <div class="feature-box col-md-4">
          <i class="icon fa-solid fa-bullseye fa-4x"></i>
          <h3>Innovative Treatment</h3>
          <p>Non surgical Treatment and life changing care.</p>
        </div>
        <div class="feature-box col-md-4">
          <i class="icon fa-solid fa-heart fa-4x"></i>
          <h3>All pets,All poisons</h3>
          <p>Expertise to handle any poisoning situation.</p>
        </div>
      </div>

  </section>


  <!-- Testimonials -->

  <section id="testimonials">


    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
      <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>

      </ol>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <h2 class="testimonial">Curated by vets for you pet's unique needs</h2>


        </div>
        <div class="carousel-item">
          <h2 class="testimonial-text">NUTRITION CONSULTATION</h2>
          <h2 class="testimonial-text">Dog/Cat Parenting Management</h2>
          <h2 class="testimonial-text">Dog/Cat Behavioral Training Tips</h2>


        </div>


      </div>
      <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
    <!--  <h2>I no longer have to sniff other dogs for love. I've found the hottest Corgi on TinDog. Woof.</h2>
    <img class="testimonial-image" src="images/dog-img.jpg" alt="dog-profile">
    <em>Pebbles, New York</em>
-->
    <!-- <h2 class="testimonial-text">My dog used to be so lonely, but with TinDog's help, they've found the love of their life. I think.</h2>
    <img class="testimonial-image" src="images/lady-img.jpg" alt="lady-profile">
    <em>Beverly, Illinois</em> -->

  </section>


  <!-- Press -->

  <section id="press">
    <img class="press-image" src="resources/images/TechCrunch.png" alt="tc-logo">
    <img class="press-image" src="resources/images/tnw.png" alt="tnw-logo">
    <img class="press-image" src="resources/images/bizinsider.png" alt="biz-insider-logo">
    <img class="press-image" src="resources/images/mashable.png" alt="mashable-logo">

  </section>


  <!-- Pricing -->

  <section id="Service">

    <h2>Our Services</h2>
    <p>Simple and affordable price plans for your and your dog.</p>


      <div class="row">
        <div class="col-lg-4 col-md-6 pricing-col">
          <div class="card">
            <div class="card-header">
              <h3>DONATE</h3>
            </div>
            <div class="card-body">
              <h2>Free</h2>
              <p>Donate pet food</p>
              <p>Donate pet clothes</p>
              <p>Donate money for Treatment</p>
              <button class="btn btn-block btn-lg btn-dark" type="button">Sign Up</button>
            </div>
          </div>

        </div>
        <div class="col-lg-4 col-md-6 pricing-col">
          <div class="card">
            <div class="card-header">
              <h3>Pet Vaccination</h3>
            </div>
            <div class="card-body">
              <h2>$49 / mo</h2>
              <p>Unlimited Matches</p>
              <p>Unlimited Messages</p>
              <p>Unlimited App Usage</p>
              <button class="btn btn-block btn-lg btn-dark" type="button">Sign Up</button>
            </div>
          </div>

        </div>
        <div class="col-lg-4 col-md-12 pricing-col">
          <div class="card">
        <div class="card-header">
          <h3></h3>
        </div>
        <div class="card-body">

          <h2>$99 / mo</h2>
          <p>Pirority Listing</p>
          <p>Unlimited Matches</p>
          <p>Unlimited Messages</p>
          <p>Unlimited App Usage</p>
          <button class="btn btn-block btn-lg btn-dark" type="button">Sign Up</button>
        </div>
        </div>

        </div>
      </div>

















  </section>


  <!-- Call to Action -->

  <section id="contact">
    <div class="cta1">



    <h3 id="ctah3">Love and Care.</h3>
    <p>"After Dr Tisha's apperance in my Lucky's life</p>
    <p>he became another dog.His eye problem was cured well."</p>
    <form id="test" action="testimonal"><button class="btn btn-dark btn-lg download" >Click for more testimonal</button></form>


</div>
  </section>






  <!-- Footer -->

  <footer id="footer">
    <i class="fa-brands fa-twitter"></i>
    <i class="fa-brands fa-facebook"></i>
    <i class="fa-brands fa-instagram"></i>
    <i class="fa-solid fa-envelope"></i>
    <br />
    <p>© Copyright MagicPaw</p>

  </footer>


</body>

</html>
