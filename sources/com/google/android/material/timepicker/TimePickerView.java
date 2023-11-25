package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import v6.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TimePickerView extends ConstraintLayout {
    private final Chip K;
    private final Chip L;
    private final ClockHandView M;
    private final ClockFaceView N;
    private final MaterialButtonToggleGroup O;
    private final View.OnClickListener P;

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.v(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements View.OnTouchListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ GestureDetector f10663f;

        c(GestureDetector gestureDetector) {
            this.f10663f = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f10663f.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    interface d {
    }

    /* loaded from: classes3.dex */
    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e u(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d v(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void x() {
        Chip chip = this.K;
        int i10 = v6.f.L;
        chip.setTag(i10, 12);
        this.L.setTag(i10, 10);
        this.K.setOnClickListener(this.P);
        this.L.setOnClickListener(this.P);
        this.K.setAccessibilityClassName("android.view.View");
        this.L.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void y() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.K.setOnTouchListener(cVar);
        this.L.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.L.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.P = new a();
        LayoutInflater.from(context).inflate(h.f24753m, this);
        this.N = (ClockFaceView) findViewById(v6.f.f24722k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(v6.f.f24725n);
        this.O = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                TimePickerView.this.w(materialButtonToggleGroup2, i11, z10);
            }
        });
        this.K = (Chip) findViewById(v6.f.f24728q);
        this.L = (Chip) findViewById(v6.f.f24726o);
        this.M = (ClockHandView) findViewById(v6.f.f24723l);
        y();
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
    }
}
