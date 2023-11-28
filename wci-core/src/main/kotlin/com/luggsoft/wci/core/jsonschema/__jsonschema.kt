package com.luggsoft.wci.core.jsonschema

import com.github.victools.jsonschema.generator.Module
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder

class AtcModule(
    private val options: Set<AtcOption> = emptySet(),
) : Module
{
    override fun applyToConfigBuilder(builder: SchemaGeneratorConfigBuilder)
    {
        val objectMapper = builder.objectMapper
        
        val fieldConfigPart = builder.forFields()
        val methodConfigPart = builder.forMethods()
        
    }
}

enum class AtcOption

fun example() {
    val module = AtcModule()
}
