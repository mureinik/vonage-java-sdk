/*
 *   Copyright 2020 Vonage
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.vonage.client.verify;

import com.vonage.client.HttpWrapper;
import com.vonage.client.VonageClientException;
import com.vonage.client.VonageResponseParseException;

class SearchEndpoint {
    private SearchMethod searchMethod;

    SearchEndpoint(HttpWrapper httpWrapper) {
        this.searchMethod = new SearchMethod(httpWrapper);
    }

    SearchVerifyResponse search(String... requestIds) throws VonageClientException, VonageResponseParseException {
        return this.searchMethod.execute(new SearchRequest(requestIds));
    }
}
