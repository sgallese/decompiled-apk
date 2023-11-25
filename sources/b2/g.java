package b2;

/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(char c10, char c11) {
        if (Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11)) {
            return true;
        }
        return false;
    }
}
