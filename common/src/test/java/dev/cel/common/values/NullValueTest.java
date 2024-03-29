// Copyright 2023 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dev.cel.common.values;

import static com.google.common.truth.Truth.assertThat;

import dev.cel.common.types.SimpleType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NullValueTest {

  @Test
  public void nullValueTest() {
    assertThat(NullValue.NULL_VALUE.value()).isEqualTo(NullValue.NULL_VALUE);
    assertThat(NullValue.NULL_VALUE.isZeroValue()).isTrue();
  }

  @Test
  public void celTypeTest() {
    NullValue value = NullValue.NULL_VALUE;

    assertThat(value.celType()).isEqualTo(SimpleType.NULL_TYPE);
  }
}
