package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: s  reason: collision with root package name */
    private final a f6260s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f6261t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f6262u;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!SwitchPreference.this.callChangeListener(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                SwitchPreference.this.d(z10);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6260s = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.O0, i10, i11);
        i(androidx.core.content.res.l.o(obtainStyledAttributes, t.W0, t.P0));
        g(androidx.core.content.res.l.o(obtainStyledAttributes, t.V0, t.Q0));
        m(androidx.core.content.res.l.o(obtainStyledAttributes, t.Y0, t.S0));
        l(androidx.core.content.res.l.o(obtainStyledAttributes, t.X0, t.T0));
        f(androidx.core.content.res.l.b(obtainStyledAttributes, t.U0, t.R0, false));
        obtainStyledAttributes.recycle();
    }

    private void n(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f6268f);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f6261t);
            r42.setTextOff(this.f6262u);
            r42.setOnCheckedChangeListener(this.f6260s);
        }
    }

    private void o(View view) {
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        n(view.findViewById(16908352));
        j(view.findViewById(16908304));
    }

    public void l(CharSequence charSequence) {
        this.f6262u = charSequence;
        notifyChanged();
    }

    public void m(CharSequence charSequence) {
        this.f6261t = charSequence;
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(m mVar) {
        super.onBindViewHolder(mVar);
        n(mVar.a(16908352));
        k(mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void performClick(View view) {
        super.performClick(view);
        o(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.l.a(context, n.f6354l, 16843629));
    }
}
