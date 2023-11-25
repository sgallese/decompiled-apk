package w1;

import java.text.CharacterIterator;

/* compiled from: CharSequenceCharacterIterator.kt */
/* loaded from: classes.dex */
public final class g implements CharacterIterator {

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f25268f;

    /* renamed from: m  reason: collision with root package name */
    private final int f25269m;

    /* renamed from: p  reason: collision with root package name */
    private final int f25270p;

    /* renamed from: q  reason: collision with root package name */
    private int f25271q;

    public g(CharSequence charSequence, int i10, int i11) {
        qc.q.i(charSequence, "charSequence");
        this.f25268f = charSequence;
        this.f25269m = i10;
        this.f25270p = i11;
        this.f25271q = i10;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            Object clone = super.clone();
            qc.q.h(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f25271q;
        if (i10 == this.f25270p) {
            return (char) 65535;
        }
        return this.f25268f.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f25271q = this.f25269m;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f25269m;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f25270p;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f25271q;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f25269m;
        int i11 = this.f25270p;
        if (i10 == i11) {
            this.f25271q = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f25271q = i12;
        return this.f25268f.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f25271q + 1;
        this.f25271q = i10;
        int i11 = this.f25270p;
        if (i10 >= i11) {
            this.f25271q = i11;
            return (char) 65535;
        }
        return this.f25268f.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f25271q;
        if (i10 <= this.f25269m) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f25271q = i11;
        return this.f25268f.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.f25269m;
        boolean z10 = false;
        if (i10 <= this.f25270p && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            this.f25271q = i10;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
