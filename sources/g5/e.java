package g5;

import java.io.FileNotFoundException;
import java.io.IOException;
import okio.r0;

/* compiled from: FileSystems.kt */
/* loaded from: classes.dex */
public final class e {
    public static final void a(okio.j jVar, r0 r0Var) {
        if (!jVar.j(r0Var)) {
            l.d(jVar.o(r0Var));
        }
    }

    public static final void b(okio.j jVar, r0 r0Var) {
        try {
            IOException iOException = null;
            for (r0 r0Var2 : jVar.k(r0Var)) {
                try {
                    if (jVar.l(r0Var2).f()) {
                        b(jVar, r0Var2);
                    }
                    jVar.h(r0Var2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException == null) {
                return;
            }
            throw iOException;
        } catch (FileNotFoundException unused) {
        }
    }
}
