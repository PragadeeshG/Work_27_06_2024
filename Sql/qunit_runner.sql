create table if not exists qunit_runner(
test_case_id Integer not null,
runner_qunit1 varchar(255) null,
runner_value1 varchar(255) null,
runner_qunit2 varchar(255) null,
runner_value2 varchar(255) null,
runner_qunit3 varchar(255) null,
runner_value3 varchar(255) null,
runner_system varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint qunit_runner_pk primary key(test_case_id));