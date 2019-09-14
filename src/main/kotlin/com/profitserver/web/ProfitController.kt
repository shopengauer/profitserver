package com.profitserver.web

import com.profitserver.model.ProfitResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/profit"])
class ProfitController {

    @GetMapping(path = ["/info"])
    fun profitInfo(): ProfitResponse {
      return ProfitResponse()
    }
}