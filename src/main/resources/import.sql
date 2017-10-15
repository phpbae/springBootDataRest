SET NAMES utf8;

-- ----------------------------
-- Records of department_group
-- ----------------------------
INSERT INTO department_group(department_group_name) VALUES ('사업부문');
INSERT INTO department_group(department_group_name) VALUES ('개발부문');
INSERT INTO department_group(department_group_name) VALUES ('영업부문');

-- ----------------------------
-- Records of Department
-- ----------------------------
INSERT INTO department(department_name, department_group_idx) VALUES ('인사팀', 1);
INSERT INTO department(department_name, department_group_idx) VALUES ('총무팀', 1);
INSERT INTO department(department_name, department_group_idx) VALUES ('기획팀', 1);
INSERT INTO department(department_name, department_group_idx) VALUES ('개발1팀', 2);
INSERT INTO department(department_name, department_group_idx) VALUES ('개발2팀', 2);
INSERT INTO department(department_name, department_group_idx) VALUES ('해외영업팀', 3);
INSERT INTO department(department_name, department_group_idx) VALUES ('국내영업팀', 3);
-- INSERT INTO department(department_name, department_group_idx) VALUES ('기타팀', 4);


INSERT INTO member(member_description, member_name) VALUES ('파워스프링!','전설의개발자');
INSERT INTO member(member_description, member_name) VALUES ('개발2팀의 무적개발자','김보훈');