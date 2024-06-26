package com.luggsoft.wci.core.commands.standard

import com.luggsoft.wci.core.commands.query.QueryCommandRequest
import com.luggsoft.wci.core.web.WebInfo

@WebInfo(
    title = "Select Process Descriptors",
    description = "Queries for the process descriptors for executing processes.",
    isSystem = true
)
class SelectProcessDescriptorsQueryCommandRequest : QueryCommandRequest<SelectProcessDescriptorsQueryCommandResult>
