package com.ns.transferex.application.queries

import com.ns.transferex.domain.models.GetAccountByIdResponse
import com.ns.transferex.infrastructure.commandbus.Query

data class GetAccountByIdQuery(val accountId: Int) : Query<GetAccountByIdResponse?>
