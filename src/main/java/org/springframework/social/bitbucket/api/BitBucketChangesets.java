/**
 * Copyright (C) 2012 Eric Bottard (eric.bottard+ghpublic@gmail.com)
 *
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
package org.springframework.social.bitbucket.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * A container class that holds many {@link BitBucketChangeset changesets} as
 * well as information about total number of changesets available.
 *
 * @author ericbottard
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BitBucketChangesets {

    @JsonProperty
    private List<BitBucketChangeset> changesets;

    @JsonProperty
    private int limit;

    @JsonProperty
    private String start;

    @JsonProperty
    private int count;

    public List<BitBucketChangeset> getChangesets() {
        return changesets;
    }

    public int getLimit() {
        return limit;
    }

    public String getStart() {
        return start;
    }

    public int getCount() {
        return count;
    }
}
