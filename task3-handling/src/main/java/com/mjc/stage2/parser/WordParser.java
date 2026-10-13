package com.mjc.stage2.parser;

import com.mjc.stage2.entity.TextComponentType;
import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;


public class WordParser extends AbstractTextParser {


    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {

        char[] chars = string.toCharArray();

        for (char c : chars) {
            SymbolLeaf sl = new SymbolLeaf(TextComponentType.SYMBOL, c);
            abstractTextComponent.add(sl);

            if (nextParser != null) {
                nextParser.parse(abstractTextComponent, string);
            }
            abstractTextComponent.add(sl);
        }
    }
}
