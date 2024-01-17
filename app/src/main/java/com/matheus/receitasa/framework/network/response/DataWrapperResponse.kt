package com.matheus.receitasa.framework.network.response

data class DataWrapperResponse(
    val from: Int,
    val to: Int,
    val count: Int,
    val hits: List<DataContainerResponse>
)
