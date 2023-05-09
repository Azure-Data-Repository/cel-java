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

package dev.cel.common;

import dev.cel.common.annotations.Internal;

/**
 * Wrapper for an unchecked runtime exception with a CelErrorCode supplied.
 *
 * <p>Note: This is not to be confused with the notion of CEL Runtime. Use {@code
 * CelEvaluationException} instead to signify an evaluation error.
 *
 * <p>TODO: Make this class abstract and define specific exception classes that
 * corresponds to the CelErrorCode.
 */
@Internal
public class CelRuntimeException extends RuntimeException {
  private final CelErrorCode errorCode;

  public CelRuntimeException(Throwable cause, CelErrorCode errorCode) {
    super(cause);
    this.errorCode = errorCode;
  }

  public CelErrorCode getErrorCode() {
    return errorCode;
  }
}
