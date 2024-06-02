import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Sale";
        System.out.println("ID phòng ban: " + department.id);
        System.out.println("Tên phòng ban: " + department.name);
        System.out.println("----------------------------------------\n");

        Position position = new Position();
        position.id = 1;
        position.name = PositionName.DEV;
        System.out.println("ID chức vụ: " + position.id);
        System.out.println("Tên chức vụ: " + position.name);
        System.out.println("----------------------------------------\n");

        Account account = new Account();
        account.id = 1;
        account.email = "bloodmoon.251103@gmail.com";
        account.username = "quangvinh";
        account.fullName = "Nguyễn Thọ Quang Vinh";
        account.departmentId = 1;
        account.positionId = 1;
        account.createDate = LocalDate.of(2024, 6, 2);
        System.out.println("Id người dùng: " + account.id);
        System.out.println("Email người dùng: " + account.email);
        System.out.println("Username: " + account.email);
        System.out.println("Họ tên: " + account.fullName);
        System.out.println("ID phòng ban: " + account.departmentId);
        System.out.println("ID chức vụ: " + account.positionId);
        System.out.println("Ngày tạo tài khoản: " + account.createDate);
        System.out.println("----------------------------------------\n");

        Group group = new Group();
        group.id = 1;
        group.name = "VTI";
        group.creatorId = 1;
        group.createDate = LocalDate.of(2024, 6, 2);
        System.out.println("ID nhóm: " + group.id);
        System.out.println("Tên nhóm: " + group.name);
        System.out.println("ID người tạo nhóm: " + group.creatorId);
        System.out.println("Ngày tạo nhóm: " + group.createDate);
        System.out.println("----------------------------------------\n");

        GroupAccount groupAccount = new GroupAccount();
        groupAccount.groupId = 1;
        groupAccount.accountId = 1;
        groupAccount.joinDate = LocalDate.of(2024, 6, 2);
        System.out.println("ID nhóm: " + groupAccount.groupId);
        System.out.println("ID người dùng: " + groupAccount.accountId);
        System.out.println("Ngày tham gia: " + groupAccount.joinDate);
        System.out.println("----------------------------------------\n");

        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.id = 1;
        typeQuestion.name = TypeName.ESSAY;
        System.out.println("ID loại câu hỏi: " + typeQuestion.id);
        System.out.println("Tên loại câu hỏi: " + typeQuestion.name);
        System.out.println("----------------------------------------\n");

        CategoryQuestion categoryQuestion = new CategoryQuestion();
        categoryQuestion.id = 1;
        categoryQuestion.name = "Java";
        System.out.println("ID danh mục câu hỏi: " + categoryQuestion.id);
        System.out.println("Tên danh mục câu hỏi: " + categoryQuestion.name);
        System.out.println("----------------------------------------\n");

        Question question = new Question();
        question.id = 1;
        question.content = "JDK là viết tắt của cụm từ nào?";
        question.categoryId = 1;
        question.typeId = 1;
        question.creatorId = 1;
        question.createDate = LocalDate.of(2024, 6, 2);
        System.out.println("ID câu hỏi: " + question.id);
        System.out.println("Nội dung câu hỏi: " + question.content);
        System.out.println("ID danh mục câu hỏi: " + question.categoryId);
        System.out.println("ID loại câu hỏi: " + question.typeId);
        System.out.println("ID người tạo: " + question.creatorId);
        System.out.println("Ngày tạo: " + question.createDate);
        System.out.println("----------------------------------------\n");

        Answer answer = new Answer();
        answer.id = 1;
        answer.content = "JDK là viết tắt của Java Development Kit";
        answer.questionId = 1;
        answer.isCorrect = true;
        System.out.println("ID câu trả lời: " + answer.id);
        System.out.println("Nội dung câu trả lời: " + answer.content);
        System.out.println("ID câu hỏi: " + answer.questionId);
        System.out.println("Chính xác: " + answer.isCorrect);
        System.out.println("----------------------------------------\n");

        Exam exam = new Exam();
        exam.id = 1;
        exam.code = "MD01";
        exam.title = "Bài kiểm tra Java";
        exam.categoryId = 1;
        exam.duration = 120;
        exam.creatorId = 1;
        exam.createDate = LocalDate.of(2024, 6, 2);
        System.out.println("ID bài kiểm tra: " + exam.id);
        System.out.println("Mã đề: " + exam.code);
        System.out.println("Tên bài kiểm tra: " + exam.title);
        System.out.println("ID danh mục: " + exam.categoryId);
        System.out.println("Thời gian làm bài: " + exam.duration + " phút");
        System.out.println("ID người tạo: " + exam.creatorId);
        System.out.println("Ngày tạo: " + exam.createDate);
        System.out.println("----------------------------------------\n");

        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.examId = 1;
        examQuestion.questionId = 1;
        System.out.println("ID bài thi: " + examQuestion.examId);
        System.out.println("ID câu hỏi: " + examQuestion.questionId);
    }
}
