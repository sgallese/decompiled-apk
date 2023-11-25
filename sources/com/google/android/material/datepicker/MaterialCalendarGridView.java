package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.accessibility.n0;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: f  reason: collision with root package name */
    private final Calendar f9893f;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f9894m;

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            n0Var.p0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().m());
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private View c(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l10, Long l11, Long l12, Long l13) {
        if (l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j getAdapter2() {
        return (j) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int a10;
        int d10;
        int a11;
        int d11;
        int i10;
        int i11;
        int i12;
        int i13;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        j adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f9979m;
        b bVar = adapter.f9981q;
        int max = Math.max(adapter.b(), getFirstVisiblePosition());
        int min = Math.min(adapter.m(), getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<androidx.core.util.d<Long, Long>> it = dateSelector.m().iterator();
        while (it.hasNext()) {
            androidx.core.util.d<Long, Long> next = it.next();
            Long l10 = next.f4048a;
            if (l10 != null) {
                if (next.f4049b != null) {
                    long longValue = l10.longValue();
                    long longValue2 = next.f4049b.longValue();
                    if (!e(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean f10 = com.google.android.material.internal.r.f(this);
                        if (longValue < item.longValue()) {
                            if (adapter.h(max)) {
                                left2 = 0;
                            } else if (!f10) {
                                left2 = materialCalendarGridView.c(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.c(max - 1).getLeft();
                            }
                            d10 = left2;
                            a10 = max;
                        } else {
                            materialCalendarGridView.f9893f.setTimeInMillis(longValue);
                            a10 = adapter.a(materialCalendarGridView.f9893f.get(5));
                            d10 = d(materialCalendarGridView.c(a10));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter.i(min)) {
                                left = getWidth();
                            } else if (!f10) {
                                left = materialCalendarGridView.c(min).getRight();
                            } else {
                                left = materialCalendarGridView.c(min).getLeft();
                            }
                            d11 = left;
                            a11 = min;
                        } else {
                            materialCalendarGridView.f9893f.setTimeInMillis(longValue2);
                            a11 = adapter.a(materialCalendarGridView.f9893f.get(5));
                            d11 = d(materialCalendarGridView.c(a11));
                        }
                        int itemId = (int) adapter.getItemId(a10);
                        int i14 = max;
                        int i15 = min;
                        int itemId2 = (int) adapter.getItemId(a11);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            j jVar = adapter;
                            int numColumns2 = (numColumns + getNumColumns()) - 1;
                            View c10 = materialCalendarGridView.c(numColumns);
                            int top = c10.getTop() + bVar.f9909a.c();
                            Iterator<androidx.core.util.d<Long, Long>> it2 = it;
                            int bottom = c10.getBottom() - bVar.f9909a.b();
                            if (!f10) {
                                if (numColumns > a10) {
                                    i12 = 0;
                                } else {
                                    i12 = d10;
                                }
                                if (a11 > numColumns2) {
                                    i13 = getWidth();
                                } else {
                                    i13 = d11;
                                }
                            } else {
                                if (a11 > numColumns2) {
                                    i10 = 0;
                                } else {
                                    i10 = d11;
                                }
                                if (numColumns > a10) {
                                    i11 = getWidth();
                                } else {
                                    i11 = d10;
                                }
                                int i16 = i11;
                                i12 = i10;
                                i13 = i16;
                            }
                            canvas.drawRect(i12, top, i13, bottom, bVar.f9916h);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter = jVar;
                            it = it2;
                        }
                        materialCalendarGridView = this;
                        max = i14;
                        min = i15;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f9894m) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, RecyclerView.UNDEFINED_DURATION));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9893f = u.k();
        if (g.s(getContext())) {
            setNextFocusLeftId(v6.f.f24712a);
            setNextFocusRightId(v6.f.f24715d);
        }
        this.f9894m = g.u(getContext());
        p0.u0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof j) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), j.class.getCanonicalName()));
    }
}
