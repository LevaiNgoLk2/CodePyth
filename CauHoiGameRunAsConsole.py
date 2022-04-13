questions = {}
options =[]

def addAnswer(num):
    ABCD = []#khởi tạo trong này mới ko bị trùng mảng
    Qtion = input("Nhập câu hỏi : ")
    Ans = input("Nhập câu trả lời: ").lower()
    questions[Qtion] = Ans
    options.append(ABCD)
    for b in range(4):
        OPt = input("Câu trả lời cho câu hỏi  : ")
        options[num].append(OPt)
def newGame():
    printansQuestions = 0
    global dapandung
    dapandung = 0
    for key in questions:
        print("=======================================================================")
        print(key)
        print(options[printansQuestions])
        printansQuestions +=1
        cautraloicuacau = input("--> Nhập đáp án :  ").lower()
        dapandung  += checkCorret(questions.get(key),cautraloicuacau)
def checkCorret(dapan,cautraloi):
    if dapan == cautraloi:
        print("Chính xác!!")
        return 1
    else:
        print("Sai!!")
        return 0
def printScore(score):
    print("\n")
    print("=======>ĐIỂM<=======")
    print("====================")
    print("=       ",score,"        =")
    print("====================")
def MenuGame():
    laptaoQ =0
    while True:
        print("===========================")
        print("=    1:Tạo câu hỏi(chỉ 1L)=")
        print("===========================")
        print("=    2:Bắt đầu trò chơi   =")
        print("===========================")
        print("=    3:Xem điểm           =")
        print("===========================")
        print("=    4:Stop               =")
        print("===========================")
        choice = int(input("Nhập lựa chọn của bạn :"))
        if choice == 4:
            break
        match choice:
            case 1:
                laptaoQ +=1
                if laptaoQ ==2:
                    break
                ip = int(input("SỐ CÂU HỎI :"))
                for num in range(ip):
                    addAnswer(num)
            case 2:
                newGame()
            case 3:
                printScore(dapandung)
            case 4:
                break
if __name__=="__main__":

    #-----------------
    MenuGame()
    #-----------------
