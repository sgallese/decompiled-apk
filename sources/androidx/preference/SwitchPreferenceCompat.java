package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: s  reason: collision with root package name */
    private final a f6264s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f6265t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f6266u;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!SwitchPreferenceCompat.this.callChangeListener(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                SwitchPreferenceCompat.this.d(z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6264s = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.Z0, i10, i11);
        i(androidx.core.content.res.l.o(obtainStyledAttributes, t.f6395h1, t.f6374a1));
        g(androidx.core.content.res.l.o(obtainStyledAttributes, t.f6392g1, t.f6377b1));
        m(androidx.core.content.res.l.o(obtainStyledAttributes, t.f6401j1, t.f6383d1));
        l(androidx.core.content.res.l.o(obtainStyledAttributes, t.f6398i1, t.f6386e1));
        f(androidx.core.content.res.l.b(obtainStyledAttributes, t.f6389f1, t.f6380c1, false));
        obtainStyledAttributes.recycle();
    }

    private void n(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f6268f);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f6265t);
            switchCompat.setTextOff(this.f6266u);
            switchCompat.setOnCheckedChangeListener(this.f6264s);
        }
    }

    private void o(View view) {
        if (!((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        n(view.findViewById(p.f6361f));
        j(view.findViewById(16908304));
    }

    public void l(CharSequence charSequence) {
        this.f6266u = charSequence;
        notifyChanged();
    }

    public void m(CharSequence charSequence) {
        this.f6265t = charSequence;
        notifyChanged();
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(m mVar) {
        super.onBindViewHolder(mVar);
        n(mVar.a(p.f6361f));
        k(mVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void performClick(View view) {
        super.performClick(view);
        o(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.f6353k);
    }
}
