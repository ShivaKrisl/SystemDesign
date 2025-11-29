CREATE DATABASE IF NOT EXISTS FaceBookClone;

USE FaceBookClone;

SHOW TABLES;

CREATE TABLE Users(
    email varchar(255) not NULL UNIQUE,
    password varchar(255) not NULL,
    username VARCHAR(100) not NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    userid int PRIMARY KEY AUTO_INCREMENT
);

desc users;

INSERT into users(email, password, username) VALUES
('sky@1223', '12345', 'sky22'), ('sky@12234', '12345', 'sky222'), ('sky@122345', '12345', 'sky32'), ('sky@1223456', '12345', 'sky42'), ('sky@12234567', '12345', 'sky52');

SELECT * FROM users;

SELECT * FROM USERS LIMIT 2 OFFSET 0;

SELECT * FROM USERS LIMIT 2 OFFSET 2;

CREATE TABLE Posts(
    postid int PRIMARY KEY AUTO_INCREMENT,
    userid int,
    content VARCHAR(500) not NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (userid) REFERENCES Users(userid)
);

INSERT into Posts(userid, content) VALUES
(1, 'Hello World! This is my first post.'),
(2, 'Just had a great day at the park!'),
(1, 'Loving the new features on this platform.'),
(3, 'Anyone up for a game of chess?'),
(2, 'Check out my latest blog post on web development.');

SELECT * FROM Posts;

CREATE TABLE Comments(
    commentid int PRIMARY KEY AUTO_INCREMENT,
    postid int,
    userid int,
    content VARCHAR(300) not NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (postid) REFERENCES Posts(postid),
    FOREIGN KEY (userid) REFERENCES Users(userid)
);

INSERT into Comments(postid, userid, content) VALUES
(1, 2, 'Welcome to the platform!'),
(1, 3, 'Nice to see you here!'),
(2, 1, 'Glad you had a great day!'),
(3, 2, 'I love the new features too!'),
(4, 1, 'I would love to play chess sometime.');


SELECT * FROM Comments;

-- Create Likes table you can like posts, comments, reels, stories.threads etc so use enum
CREATE TABLE Likes(
    likeid int PRIMARY KEY AUTO_INCREMENT,
    userid int,
    content_type ENUM('POST', 'COMMENT') not NULL,
    content_id int not NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (userid) REFERENCES Users(userid)
);

INSERT into Likes(userid, content_type, content_id) VALUES
(1, 'POST', 2),
(2, 'POST', 1),
(3, 'COMMENT', 1),
(1, 'COMMENT', 3),
(2, 'POST', 3);

SELECT * FROM Likes;

-- ADD another type reel
ALTER Table likes modify content_type ENUM('POST', 'COMMENT', 'REEL') not NULL;

-- insert type reel
INSERT into Likes(userid, content_type, content_id) VALUES
(3, 'REEL', 1),
(1, 'REEL', 2);

-- JOIN Queries
-- Get all posts along with the username of the poster
SELECT Posts.postid, Posts.content, Users.username, Posts.created_at
FROM Posts
JOIN Users ON Posts.userid = Users.userid;

-- Get all comments for a specific post along with the usernames of the commenters
SELECT Comments.commentid, Comments.content, Users.username, Comments.created_at
FROM Comments
JOIN Users ON Comments.userid = Users.userid
WHERE Comments.postid = 1;

-- Get the number of likes for each post
SELECT Posts.postid, Posts.content, COUNT(Likes.likeid) AS like_count
FROM Posts
LEFT JOIN Likes ON Posts.postid = Likes.content_id AND Likes.content_type = 'POST'
GROUP BY Posts.postid;
