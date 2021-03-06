/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.streaming.expression.relation;

import java.io.Serializable;

/**
 * 关系运算
 * 
 * 
 */
public interface ICompare extends Serializable
{
    /**
     * 相等关系运算
     * 
     * @param left 左值
     * @param right 右值
     * @return 相等返回true， 否则返回false。其中一个空值，返回null。
     */
    public Boolean equals(Object left, Object right);
    
    /**
     * 不等关系运算
     * 
     * @param left 左值
     * @param right 右值
     * @return 不等返回true， 否则返回false。其中一个空值，返回null。
     */
    public Boolean notEquals(Object left, Object right);
    
    /**
     * 小于关系运算
     * 
     * @param left 左值
     * @param right 右值
     * @return 左值小于右值返回true， 否则返回false。其中一个空值，返回null。
     */
    public Boolean lessThan(Object left, Object right);
    
    /**
     * 大于关系运算
     * 
     * @param left 左值
     * @param right 右值
     * @return 左值大于右值返回true， 否则返回false。其中一个空值，返回null。
     */
    public Boolean greaterThan(Object left, Object right);
    
    /**
     * 小于等于关系运算
     * 
     * @param left 左值
     * @param right 右值
     * @return 左值小于等于右值返回true， 否则返回false。其中一个空值，返回null。
     */
    public Boolean lessOrEquals(Object left, Object right);
    
    /**
     * 大于等于关系运算
     * 
     * @param left 左值
     * @param right 右值
     * @return 左值大于等于右值返回true， 否则返回false。其中一个空值，返回null。
     */
    public Boolean greaterOrEquals(Object left, Object right);
    
}
