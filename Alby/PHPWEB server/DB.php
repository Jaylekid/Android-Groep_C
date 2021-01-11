<?php 
//define the database url, database username, database password and database name
$db_url ="localhost";
$db_user="root";
$db_pass="";
$db_name="yajo";

//define time stamp
$time_stamp = time();
//deze functie post een review en neemt vier variable de post image, post text, userID en caragoryID.
function post_image($Post_IMG,$Post_text,$userID,$catagoryID){
   $con=mysqli_connect($db_url,$db_user,$db_pass,$db_name);
   $sql="INSERT INTO Posts (PostImage, PostText, UserID, CatagoryID) VALUES ($Post_IMG,$Post_text,$userID,$catagoryID)";
   if (mysqli_query($con,$sql)) {
      echo "Values have been inserted successfully";
   }
}
//review
function post_review($review_content,$review_rating,$userID,$postID){
    $con=mysqli_connect($db_url,$db_user,$db_pass,$db_name);
    $sql="INSERT INTO Reviews (ReviewContent, ReviewRating, ReviewDate, UserID, PostID) VALUES ($review_content,$review_rating,$time_stamp,$userID,$postID)";
    if (mysqli_query($con,$sql)) {
       echo "Values have been inserted successfully";
    }
 }

 //add catagory
 function add_catagory($catagory_name){
    $con=mysqli_connect($db_url,$db_user,$db_pass,$db_name);
    $sql="INSERT INTO Catagorys (CatagoryName) VALUES ($catagory_name)";
    if (mysqli_query($con,$sql)) {
       echo "Values have been inserted successfully";
    }

add_catagory("Fietsen");
 }




?>