package com.ll.exam.member;

import com.ll.exam.Rq;

public class MemberController {
    public void showList(Rq rq) {
        rq.appendBody("멤버 리스트 출력");
    }
}
