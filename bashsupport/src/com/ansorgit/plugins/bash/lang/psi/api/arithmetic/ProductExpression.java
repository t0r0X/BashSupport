/*
 * Copyright 2010 Joachim Ansorg, mail@ansorg-it.com
 * File: ProductExpression.java, Class: ProductExpression
 * Last modified: 2010-05-08
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ansorgit.plugins.bash.lang.psi.api.arithmetic;

/**
 * An arithmetic sum expression.
 * <p/>
 * User: jansorg
 * Date: Feb 6, 2010
 * Time: 10:57:11 AM
 */
public interface ProductExpression extends ArithmeticExpression {
    /**
     * Returns true if this product expression is a division and would have a remainder
     * if it was floating point arithmetic.
     *
     * @return True if a remainder would be there
     */
    public boolean hasDivisionRemainder();
}