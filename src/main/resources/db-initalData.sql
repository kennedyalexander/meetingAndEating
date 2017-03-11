INSERT INTO USERS VALUES ('oranges', 'password', 1);
INSERT INTO USERS VALUES ('user',  'password', 1);
INSERT INTO USERS VALUES ('user2', 'password', 1);
INSERT INTO USERS VALUES ('alexander', 'password', 1);
INSERT INTO USERS VALUES ('suger','password', 1);
INSERT INTO USERS VALUES ('krankenwagen', 'password', 1);
INSERT INTO USERS VALUES ('teenager', 'teenager', 1);

INSERT INTO USER_ROLES VALUES (1, 'user', 'ROLE_USER');
INSERT INTO USER_ROLES VALUES (2, 'user2', 'ROLE_USER');
INSERT INTO USER_ROLES VALUES (3, 'alexander', 'ROLE_USER');
INSERT INTO USER_ROLES VALUES (4, 'suger', 'ROLE_USER');

INSERT INTO USER_INFORMATION VALUES ('user', 'Alexander', 'Kennedy', 'Alexander@Alexander.com', '2001-02-04', '01,02,010,2020');



INSERT INTO MEETING_EVENTS(e_uuid, e_name, e_date, e_guestSpace, e_location) VALUES ('fabe0e0b-ffe4-4afa-ba3a-f5504fae76f2', 'event1', '2001-02-04', 5, 'location');
INSERT INTO MEETING_EVENTS(e_uuid, e_name, e_date, e_guestSpace, e_location) VALUES ('13554bcc-88f4-4c9d-8488-5163be7780b5', 'event2', '2001-02-04', 4, 'location');
INSERT INTO MEETING_EVENTS(e_uuid, e_name, e_date, e_guestSpace, e_location) VALUES ('7334675f-f617-4f5f-8048-4d13a637dd93', 'event3', '2001-02-04', 3, 'location');
    
INSERT INTO USER_EVENT(ue_username, ue_eventid, ue_userPosition) VALUES ('user', 'fabe0e0b-ffe4-4afa-ba3a-f5504fae76f2', 'location');
INSERT INTO USER_EVENT(ue_username, ue_eventid, ue_userPosition) VALUES ('user2', '7334675f-f617-4f5f-8048-4d13a637dd93', 'location');
    
