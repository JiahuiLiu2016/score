-- 集团表
-- 用于存储学校所属的集团信息，每个集团有唯一的 ID，包含集团名称、地址等信息
CREATE TABLE group_company
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '集团ID，自增主键',
    name        VARCHAR(100) NOT NULL COMMENT '集团名称',
    address     VARCHAR(200) COMMENT '集团总部地址',
    delete_flag TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='存储学校所属集团的信息';

-- 学校表
-- 存储学校的基本信息，包括学校 ID、名称、地址、所属集团 ID 等
CREATE TABLE school
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '学校ID，自增主键',
    name             VARCHAR(100) NOT NULL COMMENT '学校名称',
    address          VARCHAR(200) COMMENT '学校地址',
    group_company_id BIGINT COMMENT '所属集团ID',
    delete_flag      TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='存储学校的基本信息';

-- 学年表
-- 记录学年的信息，每个学年有唯一的 ID 和名称
CREATE TABLE academic_year
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '学年ID，自增主键',
    name        VARCHAR(20) NOT NULL COMMENT '学年名称，如2023 - 2024学年',
    start_date  DATE        NOT NULL COMMENT '学年开始日期',
    end_date    DATE        NOT NULL COMMENT '学年结束日期',
    delete_flag TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录学年的信息';

-- 班级层次表
-- 用于定义班级的层次，如火箭班、平行班等，包含层次 ID、名称和描述信息
CREATE TABLE class_level
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '班级层次ID，自增主键',
    name        VARCHAR(50) NOT NULL COMMENT '班级层次名称，如火箭班、平行班等',
    description VARCHAR(200) COMMENT '班级层次描述',
    delete_flag TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='定义班级的层次信息';

-- 教师表
-- 存储教师的基本信息，包括教师 ID、编号、姓名、性别、所属学校 ID 等
CREATE TABLE teacher
(
    id                BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '教师ID，自增主键',
    teacher_id        VARCHAR(20) NOT NULL UNIQUE COMMENT '教师编号，唯一标识',
    name              VARCHAR(50) NOT NULL COMMENT '教师姓名',
    gender            VARCHAR(10) COMMENT '教师性别',
    current_school_id BIGINT COMMENT '当前所属学校ID',
    delete_flag       TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='存储教师的基本信息';

-- 班级表
-- 存储班级的信息，包括班级 ID、名称、所属学年 ID、学校 ID、班主任教师 ID、班级层次 ID 等
CREATE TABLE class
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '班级ID，自增主键',
    name             VARCHAR(50) NOT NULL COMMENT '班级名称',
    academic_year_id BIGINT COMMENT '所属学年ID',
    school_id        BIGINT COMMENT '所属学校ID',
    class_teacher_id BIGINT COMMENT '班主任教师ID',
    class_level_id   BIGINT COMMENT '班级层次ID',
    delete_flag      TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='存储班级的信息';

-- 本校学生表
-- 存储本校学生的基本信息，包括学生 ID、编号、姓名、性别、所属学校 ID 等
CREATE TABLE local_student
(
    id              BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '本校学生ID，自增主键',
    student_id      VARCHAR(20) NOT NULL UNIQUE COMMENT '学生编号，唯一标识',
    name            VARCHAR(50) NOT NULL COMMENT '学生姓名',
    gender          VARCHAR(10) COMMENT '学生性别',
    school_id       BIGINT COMMENT '所属学校ID',
    enrollment_date DATE        NOT NULL COMMENT '入学日期',
    graduation_date DATE       DEFAULT NULL COMMENT '毕业日期，为空表示未毕业',
    is_graduated    TINYINT(1) DEFAULT 0 COMMENT '是否毕业，0表示未毕业，1表示已毕业',
    delete_flag     TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='存储本校学生的基本信息';

-- 外校学生表
-- 存储外校学生的基本信息，包括学生 ID、编号、姓名、性别、所在学校名称等
CREATE TABLE external_student
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '外校学生ID，自增主键',
    student_id  VARCHAR(20)  NOT NULL UNIQUE COMMENT '学生编号，唯一标识',
    name        VARCHAR(50)  NOT NULL COMMENT '学生姓名',
    gender      VARCHAR(10) COMMENT '学生性别',
    school_name VARCHAR(100) NOT NULL COMMENT '外校学校名称',
    delete_flag TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='存储外校学生的基本信息';

-- 分班记录表
-- 记录本校学生的分班信息，包括分班记录 ID、学生 ID、班级 ID、学年 ID、是否为当前班级、入学日期等
CREATE TABLE class_history
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '分班记录ID，自增主键',
    student_id       BIGINT COMMENT '本校学生ID',
    class_id         BIGINT COMMENT '班级ID',
    academic_year_id BIGINT COMMENT '学年ID',
    is_current       TINYINT(1) DEFAULT 0 COMMENT '是否为当前班级，0表示否，1表示是',
    entry_date       DATE COMMENT '学生进入该班级的日期',
    end_date         DATE       DEFAULT NULL COMMENT '学生离开该班级的日期，为空表示当前仍在该班级',
    delete_flag      TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录本校学生的分班信息';

-- 学科表
-- 存储学科的信息，包括学科 ID、名称、类型（如统一科目、首选科目、再选科目）、是否必考、是否为外语科目等
CREATE TABLE subject
(
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '学科ID，自增主键',
    name                VARCHAR(50) NOT NULL COMMENT '学科名称',
    type                VARCHAR(20) NOT NULL COMMENT '学科类型，如统一科目、首选科目、再选科目',
    is_required         TINYINT(1) DEFAULT 0 COMMENT '是否为必考科目，0表示非必考，1表示必考',
    is_foreign_language TINYINT(1) DEFAULT 0 COMMENT '是否为外语科目，0表示否，1表示是',
    delete_flag         TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='存储学科的信息';

-- 学科 - 学年关联表
-- 记录学科在哪些学年有效，包含关联 ID、学科 ID、学年 ID 等信息
CREATE TABLE subject_academic_year
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '学科 - 学年关联ID，自增主键',
    subject_id       BIGINT COMMENT '学科ID',
    academic_year_id BIGINT COMMENT '学年ID',
    delete_flag      TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录学科在哪些学年有效';

-- 本校学生 - 学科关联表
-- 记录本校学生的学科选择信息，包括关联 ID、学生 ID、学科 ID、学年 ID、是否选考、是否为外语科目选择、选择时间等
CREATE TABLE local_student_subject
(
    id                            BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '学生 - 学科关联ID，自增主键',
    student_id                    BIGINT COMMENT '本校学生ID',
    subject_id                    BIGINT COMMENT '学科ID',
    academic_year_id              BIGINT COMMENT '学年ID',
    is_selected                   TINYINT(1) DEFAULT 0 COMMENT '是否为选考科目，0表示否，1表示是',
    is_foreign_language_selection TINYINT(1) DEFAULT 0 COMMENT '是否为外语科目选择，0表示否，1表示是',
    selection_date                DATETIME COMMENT '学生选择该学科的时间',
    delete_flag                   TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录本校学生的学科选择信息';

-- 外校学生 - 学科关联表
-- 记录外校学生的学科选择信息，包括关联 ID、学生 ID、学科 ID、学年 ID、是否选考、是否为外语科目选择等
CREATE TABLE external_student_subject
(
    id                            BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '外校学生 - 学科关联ID，自增主键',
    student_id                    BIGINT COMMENT '外校学生ID',
    subject_id                    BIGINT COMMENT '学科ID',
    academic_year_id              BIGINT COMMENT '学年ID',
    is_selected                   TINYINT(1) DEFAULT 0 COMMENT '是否为选考科目，0表示否，1表示是',
    is_foreign_language_selection TINYINT(1) DEFAULT 0 COMMENT '是否为外语科目选择，0表示否，1表示是',
    delete_flag                   TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录外校学生的学科选择信息';

-- 考试类型表
-- 存储考试类型的信息，包括考试类型 ID、名称等
CREATE TABLE exam_type
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '考试类型ID，自增主键',
    name        VARCHAR(50) NOT NULL COMMENT '考试类型名称，如期中、期末等',
    delete_flag TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='存储考试类型的信息';

-- 联考表
-- 记录联考的信息，包括联考 ID、名称、考试日期、是否有所有学校学生信息等
CREATE TABLE joint_exam
(
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '联考ID，自增主键',
    name                VARCHAR(100) NOT NULL COMMENT '联考名称',
    exam_date           DATE COMMENT '联考日期',
    has_all_school_info TINYINT(1) DEFAULT 0 COMMENT '是否有所有学校学生信息，0表示没有，1表示有',
    delete_flag         TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录联考的信息';

-- 联考学校关联表
-- 记录参与联考的学校信息，包括关联 ID、联考 ID、学校 ID 等
CREATE TABLE joint_exam_school
(
    id            BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '联考学校关联ID，自增主键',
    joint_exam_id BIGINT COMMENT '联考ID',
    school_id     BIGINT COMMENT '学校ID',
    delete_flag   TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录参与联考的学校信息';

-- 成绩表
-- 存储学生的成绩信息，包括成绩记录 ID、本校学生 ID、外校学生 ID、学科 ID、考试类型 ID、学年 ID、联考 ID、原始成绩、赋分后的成绩等
CREATE TABLE grade
(
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '成绩记录ID，自增主键',
    local_student_id    BIGINT COMMENT '本校学生ID',
    external_student_id BIGINT COMMENT '外校学生ID',
    subject_id          BIGINT COMMENT '学科ID',
    exam_type_id        BIGINT COMMENT '考试类型ID',
    academic_year_id    BIGINT COMMENT '学年ID',
    joint_exam_id       BIGINT COMMENT '联考ID',
    raw_score           DOUBLE COMMENT '原始成绩',
    assigned_score      DOUBLE COMMENT '赋分后的成绩',
    is_passed           TINYINT(1) COMMENT '是否通过考试，0表示未通过，1表示通过',
    exam_date           DATE COMMENT '考试日期',
    grade_level         VARCHAR(20) COMMENT '成绩等级，如优秀、良好等',
    remark              VARCHAR(200) COMMENT '备注信息，如缺考、缓考等',
    delete_flag         TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='存储学生的成绩信息';

-- 联考本校学生学科排名表
-- 记录联考时本校学生各科的排名信息，包括排名记录 ID、本校学生 ID、学科 ID、联考 ID、学科排名等
CREATE TABLE joint_exam_local_student_subject_rank
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '排名记录ID，自增主键',
    local_student_id BIGINT COMMENT '本校学生ID',
    subject_id       BIGINT COMMENT '学科ID',
    joint_exam_id    BIGINT COMMENT '联考ID',
    subject_rank     INT COMMENT '学科排名',
    delete_flag      TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录联考时本校学生各科的排名信息';

-- 联考本校学生总分排名表
-- 记录联考时本校学生的总分排名信息，包括排名记录 ID、本校学生 ID、联考 ID、总分排名等
CREATE TABLE joint_exam_local_student_total_rank
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '排名记录ID，自增主键',
    local_student_id BIGINT COMMENT '本校学生ID',
    joint_exam_id    BIGINT COMMENT '联考ID',
    total_rank       INT COMMENT '总分排名',
    delete_flag      TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录联考时本校学生的总分排名信息';

-- 班级 - 学科 - 教师关联表
-- 记录班级、学科和教师的关联信息，包括关联 ID、班级 ID、学科 ID、教师 ID、学年 ID 等
CREATE TABLE class_subject_teacher
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '班级 - 学科 - 教师关联ID，自增主键',
    class_id         BIGINT COMMENT '班级ID',
    subject_id       BIGINT COMMENT '学科ID',
    teacher_id       BIGINT COMMENT '教师ID',
    academic_year_id BIGINT COMMENT '学年ID',
    start_date       DATE COMMENT '教师开始授课日期',
    end_date         DATE       DEFAULT NULL COMMENT '教师结束授课日期，为空表示仍在授课',
    delete_flag      TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录班级、学科和教师的关联信息';

-- 教师调动记录表
-- 记录教师在一个学年内的调动信息，包括调动 ID、教师 ID、原学校 ID、新学校 ID、调动起始日期、调动结束日期等
CREATE TABLE teacher_transfer
(
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '教师调动ID，自增主键',
    teacher_id          BIGINT COMMENT '教师ID',
    original_school_id  BIGINT COMMENT '原学校ID',
    new_school_id       BIGINT COMMENT '新学校ID',
    transfer_start_date DATE COMMENT '调动起始日期',
    transfer_end_date   DATE       DEFAULT NULL COMMENT '调动结束日期，为空表示仍在新学校',
    academic_year_id    BIGINT COMMENT '所属学年ID',
    transfer_order      INT COMMENT '调动顺序，用于记录教师在同一学年内的多次调动',
    delete_flag         TINYINT(1) DEFAULT 0 COMMENT '逻辑删除标志，0表示未删除，1表示已删除'
) COMMENT ='记录教师在一个学年内的调动信息';