/*
 * Copyright (C) 2013 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thriftzmq;

import java.util.concurrent.atomic.AtomicInteger;
import org.apache.thrift.TException;
import org.thriftzmq.test.Service1;

/**
 *
 * @author Vyacheslav Baranov
 */
public class Service1Impl implements Service1.Iface {

    @Override
    public String echo(String s) throws TException {
        return s;
    }

    @Override
    public void voidMethod(String s) throws TException {
        //Do nothing
    }

    @Override
    public void onewayMethod(String s) throws TException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
