package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private Drawable mDialogIcon;
    private int mDialogLayoutResId;
    private CharSequence mDialogMessage;
    private CharSequence mDialogTitle;
    private CharSequence mNegativeButtonText;
    private CharSequence mPositiveButtonText;

    /* loaded from: classes.dex */
    public interface a {
        <T extends Preference> T findPreference(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f6399j, i10, i11);
        String o10 = androidx.core.content.res.l.o(obtainStyledAttributes, t.f6420t, t.f6402k);
        this.mDialogTitle = o10;
        if (o10 == null) {
            this.mDialogTitle = getTitle();
        }
        this.mDialogMessage = androidx.core.content.res.l.o(obtainStyledAttributes, t.f6418s, t.f6404l);
        this.mDialogIcon = androidx.core.content.res.l.c(obtainStyledAttributes, t.f6414q, t.f6406m);
        this.mPositiveButtonText = androidx.core.content.res.l.o(obtainStyledAttributes, t.f6424v, t.f6408n);
        this.mNegativeButtonText = androidx.core.content.res.l.o(obtainStyledAttributes, t.f6422u, t.f6410o);
        this.mDialogLayoutResId = androidx.core.content.res.l.n(obtainStyledAttributes, t.f6416r, t.f6412p, 0);
        obtainStyledAttributes.recycle();
    }

    public Drawable getDialogIcon() {
        return this.mDialogIcon;
    }

    public int getDialogLayoutResource() {
        return this.mDialogLayoutResId;
    }

    public CharSequence getDialogMessage() {
        return this.mDialogMessage;
    }

    public CharSequence getDialogTitle() {
        return this.mDialogTitle;
    }

    public CharSequence getNegativeButtonText() {
        return this.mNegativeButtonText;
    }

    public CharSequence getPositiveButtonText() {
        return this.mPositiveButtonText;
    }

    @Override // androidx.preference.Preference
    protected void onClick() {
        getPreferenceManager().x(this);
    }

    public void setDialogIcon(Drawable drawable) {
        this.mDialogIcon = drawable;
    }

    public void setDialogLayoutResource(int i10) {
        this.mDialogLayoutResId = i10;
    }

    public void setDialogMessage(CharSequence charSequence) {
        this.mDialogMessage = charSequence;
    }

    public void setDialogTitle(CharSequence charSequence) {
        this.mDialogTitle = charSequence;
    }

    public void setNegativeButtonText(CharSequence charSequence) {
        this.mNegativeButtonText = charSequence;
    }

    public void setPositiveButtonText(CharSequence charSequence) {
        this.mPositiveButtonText = charSequence;
    }

    public void setDialogIcon(int i10) {
        this.mDialogIcon = h.a.b(getContext(), i10);
    }

    public void setDialogMessage(int i10) {
        setDialogMessage(getContext().getString(i10));
    }

    public void setDialogTitle(int i10) {
        setDialogTitle(getContext().getString(i10));
    }

    public void setNegativeButtonText(int i10) {
        setNegativeButtonText(getContext().getString(i10));
    }

    public void setPositiveButtonText(int i10) {
        setPositiveButtonText(getContext().getString(i10));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.l.a(context, n.f6344b, 16842897));
    }

    public DialogPreference(Context context) {
        this(context, null);
    }
}
