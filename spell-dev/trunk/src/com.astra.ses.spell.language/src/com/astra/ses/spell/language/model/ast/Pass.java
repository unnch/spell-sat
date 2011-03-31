// Autogenerated AST node
package com.astra.ses.spell.language.model.ast;
import com.astra.ses.spell.language.model.SimpleNode;

public class Pass extends stmtType {

    public Pass() {
    }

    public Pass(SimpleNode parent) {
        this();
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Pass[");
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitPass(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}
