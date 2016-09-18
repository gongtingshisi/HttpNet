/*
 * Copyright (C) 2016 huanghaibin_dev <huanghaibin_dev@163.com>
 * WebSite https://github.com/MiracleTimes-Dev
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.haibin.httpnet.core.connect;

import java.io.IOException;
import java.net.ProtocolException;

import javax.net.ssl.HttpsURLConnection;

/**
 *
 */

public class HttpsConnection extends Connection {
    private HttpsURLConnection mConnection;

    @Override
    protected int getResponseCode() throws IOException {
        return 0;
    }

    @Override
    protected void initMethod(String method) throws ProtocolException {

    }

    @Override
    protected void convertConnect() {
        mConnection = (HttpsURLConnection) mUrlConnection;
    }
}
