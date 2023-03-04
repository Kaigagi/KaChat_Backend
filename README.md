# KaChat_Backend
This is a backend of KaChat - a mobile based chat application - which will be applied as many best practice as possible. The goal of this project is to achive the standard modal of apllication, also optimize it as much as possible. 

Link to Front_End: 

### Using tech:
* Java SpringBoot 3.0

* AWS RDS - PostgresSQL

### Features (mark completed features):
- [ ] Users will be able to create and manage their profile.
- [ ] Users can add their friends to their friends list.
- [ ] Users will be able to create and join rooms.
- [ ] Users will be able to invite their friends to a room by QR code or link.
- [ ] Users will be able to chat privately to each others or in a room.

### Database Schema: 
https://drive.google.com/file/d/13LAiCU-MrzmI47lLxReru4XZHCyYLWs8/view?usp=sharing

### Plan on each features (generate on progress):
#### Users will be able to create and manage their profile.
- [ ] Create endpoints for CRUD of user entity
- [ ] Verify users using JWT token
- [ ] Add security features where users can either verify their email or reset their passwords

### Convention
#### Folder structure
- Entity based folder structure where each entity has their own folder contain Entity Class, Controller Class, Service Class and Repository Class
- config folder for all configuration in the application
- All resource should be stored in resource folder (service key, ...)

#### pom.mvn 
- Remove redundant dependencies
- Keep dependencies and packages up to date

#### Git commit
- Commit message must be marked with prefix:
  - ***feat***: new feature
  - ***bug***: bug fix
  - ***refactor***: code refactor
  - ***release***: new version release
  - ***update***: update already exist feature
  - ***remove***: remove feature
- Using branches to represent each feature
  
#### Documents & Tests
- All code should be documented using JSDoc and tested before each feature
