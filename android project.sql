CREATE DATABASE YAJO;
USE YAJO;
CREATE TABLE Users(
	UserID INT,
    UserName VARCHAR(50),
    UserEmail VARCHAR(500),
    UserPassword VARCHAR(500),
    UserVerfited TINYINT(1),
    UserSigninDate TIMESTAMP,
    UserPremmission VARCHAR(50),
    PRIMARY KEY(UserID)
);
CREATE TABLE Catagorys(
	CatagoryID INT NOT NULL,
    CatagoryName VARCHAR(100) NOT NULL
);
CREATE TABLE Posts(
	PostID INT NOT NULL,
    PostImage VARCHAR(50) NOT NULL,
    PostText TEXT NOT NULL,
    UserID INT,
    CatagoryID INT,
    PRIMARY KEY(PostID),
    FOREIGN KEY (CatagoryID) REFERENCES Catagorys(CatagoryID),
    FOREIGN KEY (UserID) REFERENCES Users(UserID)
);
CREATE TABLE Reviews(
	ReviewID INT NOT NULL,
    ReviewContent TEXT NOT NULL,
    ReviewRating FLOAT NOT NULL,
    ReviewDate TIMESTAMP NOT NULL,
    UserID INT,
    PostID int,
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
    FOREIGN KEY (PostID) REFERENCES Posts(PostID)
    
);