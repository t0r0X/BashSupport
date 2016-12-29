/*
 * Copyright (c) Joachim Ansorg, mail@ansorg-it.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ansorgit.plugins.bash.lang.psi.impl.arithmetic;

import com.ansorgit.plugins.bash.lang.psi.api.arithmetic.ArithmeticExpression;
import com.ansorgit.plugins.bash.lang.psi.api.arithmetic.AssignmentChain;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;

import java.util.List;

/**
 * @author jansorg
 */
public class AssignmentChainImpl extends AbstractExpression implements AssignmentChain {
    public AssignmentChainImpl(final ASTNode astNode) {
        super(astNode, "ArithAssignmentExpr", Type.Unsupported);
    }

    @Override
    protected Long compute(long currentValue, IElementType operator, Long nextExpressionValue) {
        throw new UnsupportedOperationException("compute is not supported");
    }

    @Override
    public long computeNumericValue() {
        //find the child after the assignment sign
        List<ArithmeticExpression> childs = subexpressions();
        if (childs.size() != 2) {
            throw new IllegalStateException("Invalid assignment, number of child expressions: " + childs.size() + ". PSI text: " + getText());
        }

        return childs.get(1).computeNumericValue();
    }
}