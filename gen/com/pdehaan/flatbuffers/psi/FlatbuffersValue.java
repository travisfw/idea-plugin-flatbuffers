// This is a generated file. Not intended for manual editing.
package com.pdehaan.flatbuffers.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FlatbuffersValue extends PsiElement {

  @Nullable
  FlatbuffersObject getObject();

  @Nullable
  FlatbuffersSingleValue getSingleValue();

  @NotNull
  List<FlatbuffersValue> getValueList();

}
