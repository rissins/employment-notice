package com.rissins.employmentnotice.controller;

import com.rissins.employmentnotice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NoticeRestController {

    private final NoticeService noticeService;
}
