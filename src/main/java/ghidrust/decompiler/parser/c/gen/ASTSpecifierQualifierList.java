package ghidrust.decompiler.parser.c.gen;

/* Generated By:JJTree: Do not edit this line. ASTSpecifierQualifierList.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTSpecifierQualifierList extends SimpleNode {
  public ASTSpecifierQualifierList(int id) {
    super(id);
  }

  public ASTSpecifierQualifierList(CParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7fafbaad1e5888617b5543d24af0d7e3 (do not edit this line) */
