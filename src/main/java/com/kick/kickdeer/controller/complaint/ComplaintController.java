package com.kick.kickdeer.controller.complaint;


import com.kick.kickdeer.controller.complaint.response.ComplaintRes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "신고 API")
@RestController
@RequestMapping("/api/complaint")
public class ComplaintController {



    @GetMapping("/admin")
    @Operation(summary = "전체 신고 리스트 조회")
    public ComplaintRes getAdminComplaintList() {

        ComplaintRes complaintRes = new ComplaintRes();

        return complaintRes;
    }



    @GetMapping("/{userId}")
    @Operation(summary = "나의 신고 리스트 조회")
    public ComplaintRes getPersonComplaintList(@PathVariable Long userId) {

        ComplaintRes complaintRes = new ComplaintRes();

        return complaintRes;
    }

    @PostMapping("/catchDeer")
    @Operation(summary = "킥라니 신고 하기")
    public ComplaintRes complainKickDeer(ComplaintRes complaintRes) {
        ComplaintRes complaintRes1 = new ComplaintRes();
        return complaintRes1;
    }











}
