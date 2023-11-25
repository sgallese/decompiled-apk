package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.core.view.accessibility.n0;
import androidx.core.view.p0;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class CheckableImageButton extends androidx.appcompat.widget.n implements Checkable {

    /* renamed from: t  reason: collision with root package name */
    private static final int[] f10080t = {16842912};

    /* renamed from: q  reason: collision with root package name */
    private boolean f10081q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10082r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10083s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        boolean f10084p;

        /* loaded from: classes3.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f10084p = z10;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f10084p ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            n0Var.l0(CheckableImageButton.this.a());
            n0Var.m0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.E);
    }

    public boolean a() {
        return this.f10082r;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10081q;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f10081q) {
            int[] iArr = f10080t;
            return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f10084p);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10084p = this.f10081q;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f10082r != z10) {
            this.f10082r = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f10082r && this.f10081q != z10) {
            this.f10081q = z10;
            refreshDrawableState();
            sendAccessibilityEvent(RecyclerView.m.FLAG_MOVED);
        }
    }

    public void setPressable(boolean z10) {
        this.f10083s = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f10083s) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f10081q);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10082r = true;
        this.f10083s = true;
        p0.u0(this, new a());
    }
}
