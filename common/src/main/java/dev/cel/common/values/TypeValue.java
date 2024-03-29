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

import com.google.auto.value.AutoValue;
import com.google.errorprone.annotations.Immutable;
import dev.cel.common.types.CelType;
import dev.cel.common.types.TypeType;

/** TypeValue holds the CEL type information for the underlying CelValue. */
@AutoValue
@Immutable
public abstract class TypeValue extends CelValue {

  @Override
  public abstract CelType value();

  @Override
  public boolean isZeroValue() {
    return false;
  }

  @Override
  public abstract TypeType celType();

  public static TypeValue create(CelType value) {
    return new AutoValue_TypeValue(value, TypeType.create(value));
  }
}
