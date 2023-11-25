package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* compiled from: FlexContainer.java */
/* loaded from: classes.dex */
interface a {
    void c(View view, int i10, int i11, b bVar);

    void d(b bVar);

    View e(int i10);

    int f(int i10, int i11, int i12);

    void g(int i10, View view);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<b> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    View i(int i10);

    int j(View view, int i10, int i11);

    int k(int i10, int i11, int i12);

    boolean l();

    int m(View view);

    void setFlexLines(List<b> list);
}
