package pl.edu.pwsztar.domain.checking;

import pl.edu.pwsztar.domain.dto.FigureMoveDto;

public interface MoveChecking {
    boolean checkBishop(FigureMoveDto figureMoveDto);
}