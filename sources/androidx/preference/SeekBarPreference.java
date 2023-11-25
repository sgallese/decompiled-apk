package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: f  reason: collision with root package name */
    int f6243f;

    /* renamed from: m  reason: collision with root package name */
    int f6244m;

    /* renamed from: p  reason: collision with root package name */
    private int f6245p;

    /* renamed from: q  reason: collision with root package name */
    private int f6246q;

    /* renamed from: r  reason: collision with root package name */
    boolean f6247r;

    /* renamed from: s  reason: collision with root package name */
    SeekBar f6248s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f6249t;

    /* renamed from: u  reason: collision with root package name */
    boolean f6250u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6251v;

    /* renamed from: w  reason: collision with root package name */
    boolean f6252w;

    /* renamed from: x  reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f6253x;

    /* renamed from: y  reason: collision with root package name */
    private final View.OnKeyListener f6254y;

    /* loaded from: classes.dex */
    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f6252w || !seekBarPreference.f6247r) {
                    seekBarPreference.i(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.j(i10 + seekBarPreference2.f6244m);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f6247r = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f6247r = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f6244m != seekBarPreference.f6243f) {
                seekBarPreference.i(seekBar);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f6250u && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f6248s;
            if (seekBar == null) {
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
            return seekBar.onKeyDown(i10, keyEvent);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6253x = new a();
        this.f6254y = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.H0, i10, i11);
        this.f6244m = obtainStyledAttributes.getInt(t.K0, 0);
        b(obtainStyledAttributes.getInt(t.I0, 100));
        d(obtainStyledAttributes.getInt(t.L0, 0));
        this.f6250u = obtainStyledAttributes.getBoolean(t.J0, true);
        this.f6251v = obtainStyledAttributes.getBoolean(t.M0, false);
        this.f6252w = obtainStyledAttributes.getBoolean(t.N0, false);
        obtainStyledAttributes.recycle();
    }

    private void g(int i10, boolean z10) {
        int i11 = this.f6244m;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f6245p;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f6243f) {
            this.f6243f = i10;
            j(i10);
            persistInt(i10);
            if (z10) {
                notifyChanged();
            }
        }
    }

    public final void b(int i10) {
        int i11 = this.f6244m;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.f6245p) {
            this.f6245p = i10;
            notifyChanged();
        }
    }

    public final void d(int i10) {
        if (i10 != this.f6246q) {
            this.f6246q = Math.min(this.f6245p - this.f6244m, Math.abs(i10));
            notifyChanged();
        }
    }

    public void f(int i10) {
        g(i10, true);
    }

    void i(SeekBar seekBar) {
        int progress = this.f6244m + seekBar.getProgress();
        if (progress != this.f6243f) {
            if (callChangeListener(Integer.valueOf(progress))) {
                g(progress, false);
                return;
            }
            seekBar.setProgress(this.f6243f - this.f6244m);
            j(this.f6243f);
        }
    }

    void j(int i10) {
        TextView textView = this.f6249t;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(m mVar) {
        super.onBindViewHolder(mVar);
        mVar.itemView.setOnKeyListener(this.f6254y);
        this.f6248s = (SeekBar) mVar.a(p.f6358c);
        TextView textView = (TextView) mVar.a(p.f6359d);
        this.f6249t = textView;
        if (this.f6251v) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f6249t = null;
        }
        SeekBar seekBar = this.f6248s;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f6253x);
        this.f6248s.setMax(this.f6245p - this.f6244m);
        int i10 = this.f6246q;
        if (i10 != 0) {
            this.f6248s.setKeyProgressIncrement(i10);
        } else {
            this.f6246q = this.f6248s.getKeyProgressIncrement();
        }
        this.f6248s.setProgress(this.f6243f - this.f6244m);
        j(this.f6243f);
        this.f6248s.setEnabled(isEnabled());
    }

    @Override // androidx.preference.Preference
    protected Object onGetDefaultValue(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f6243f = savedState.f6255f;
            this.f6244m = savedState.f6256m;
            this.f6245p = savedState.f6257p;
            notifyChanged();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (isPersistent()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.f6255f = this.f6243f;
        savedState.f6256m = this.f6244m;
        savedState.f6257p = this.f6245p;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        f(getPersistedInt(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        int f6255f;

        /* renamed from: m  reason: collision with root package name */
        int f6256m;

        /* renamed from: p  reason: collision with root package name */
        int f6257p;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f6255f = parcel.readInt();
            this.f6256m = parcel.readInt();
            this.f6257p = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6255f);
            parcel.writeInt(this.f6256m);
            parcel.writeInt(this.f6257p);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.f6352j);
    }
}
