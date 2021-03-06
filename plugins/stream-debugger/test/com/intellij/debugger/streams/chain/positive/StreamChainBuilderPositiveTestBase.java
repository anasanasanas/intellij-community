/*
 * Copyright 2000-2017 JetBrains s.r.o.
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
package com.intellij.debugger.streams.chain.positive;

import com.intellij.debugger.streams.chain.StreamChainBuilderTestCase;
import com.intellij.debugger.streams.wrapper.StreamChain;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;

/**
 * @author Vitaliy.Bibaev
 */
public abstract class StreamChainBuilderPositiveTestBase extends StreamChainBuilderTestCase {

  @NotNull
  @Override
  protected String getRelativeTestPath() {
    return "chain" + File.separator + "positive" + File.separator + getDirectoryName();
  }

  void doTest() throws Exception {
    checkResultChains(buildChains());
  }

  @NotNull
  protected abstract String getDirectoryName();

  protected void checkResultChains(@NotNull List<StreamChain> chains) {
  }
}
