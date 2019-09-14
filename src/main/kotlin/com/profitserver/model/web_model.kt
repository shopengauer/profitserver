package com.profitserver.model

import java.math.BigDecimal

data class ProfitResponse(var ticket: String = "AAPL",
                          var divPrice: BigDecimal = BigDecimal.TEN)